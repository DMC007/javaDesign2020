package com.tom.demo.design015;

/**
 * @Author ZX
 * @Date 2020/4/28 22:42
 * @Version 1.0
 */
public class RemoteController {
    private Command[] onCommand;
    private Command[] offCommand;
    //撤销命令
    private Command undoCommand;

    public RemoteController() {
        this.onCommand = new Command[5];
        this.offCommand = new Command[5];
        for (int i = 0; i < 5; i++) {
            onCommand[i] = new NoCommand();
            offCommand[i] = new NoCommand();
        }
    }

    public void setCommand(int index, Command onCommand, Command offCommand) {
        this.onCommand[index] = onCommand;
        this.offCommand[index] = offCommand;
    }

    public void onButton(int index) {
        onCommand[index].execute();
        undoCommand = onCommand[index];
    }

    public void offButton(int index) {
        offCommand[index].execute();
        undoCommand = offCommand[index];
    }

    public void undoRemote() {
        undoCommand.undo();
    }
}
