package com.hua.command.general_soldier;

/**
 * Created by lerry on 2017/7/19.
 * <p/>
 * 调用者,相当于将军,持有命令对象,可以发号施令
 * @author lerry
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action() {
        command.exec();
    }
}
