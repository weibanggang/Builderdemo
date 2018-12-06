package com.wbg.Builderdemo;

public class DefaultRobotBuilder implements BuildRobot {
    Robot robot;

    public DefaultRobotBuilder(){
        robot=new Robot();
    }
    @Override
    public void buildHead() {
        robot.setHead("高智商机器人");
    }

    @Override
    public void buildBody() {
        robot.setBody("新的身体");
    }

    @Override
    public void buildHand() {
        robot.setHand("新的手");
    }

    @Override
    public void buildFoot() {
        robot.setFoot("金刚脚");
    }

    @Override
    public Robot createRobot() {
        return robot;
    }
}
