package com.hua.command.general_soldier;

/**
 * Created by lerry on 2017/7/19.
 * 持有命令接收者对象
 * @author lerry
 */
public class MyCommand implements Command {

    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exec() {
        receiver.action();
    }
}
