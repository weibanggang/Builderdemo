package com.wbg.Builderdemo;

public class Director  {

    private Builder builder=new ConcreteBuilder();
    public Product getProductAT(){
        builder.setProduct("奥迪","Q5");
        return builder.getProduct();
    }
    public Product getProductBM(){
        builder.setProduct("宝马","X7");
        return builder.getProduct();
    }


    public Robot createRobotByDirector(BuildRobot BuildRobot){
        BuildRobot.buildHead();
        BuildRobot.buildBody();
        BuildRobot.buildHand();
        BuildRobot.buildFoot();
        return BuildRobot.createRobot();
    }
}
