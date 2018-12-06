package com.wbg.Builderdemo;

public class BuilderTest {
    public static void main(String[] args) {
        Director driver=new Director();
         Robot robot=   driver.createRobotByDirector(new DefaultRobotBuilder());
        System.out.println(robot);
    }
}
