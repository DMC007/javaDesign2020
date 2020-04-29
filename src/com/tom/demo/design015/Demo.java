package com.tom.demo.design015;

/**
 * @Author ZX
 * @Date 2020/4/28 22:51
 * @Version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        LightReceiver lightReceiver = new LightReceiver();
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        RemoteController remoteController = new RemoteController();
        remoteController.setCommand(0, lightOnCommand, lightOffCommand);

        System.out.println("======电灯操作=====");
        remoteController.onButton(0);
        remoteController.offButton(0);
        remoteController.undoRemote();
    }
}
