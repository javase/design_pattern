package com.hua.chain;

/**
 * Created by lerry on 2016/9/1.
 *
 * @author lerry
 */
public abstract class Handler {
    protected Handler successor;

    public abstract void handlerRequest();

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}
