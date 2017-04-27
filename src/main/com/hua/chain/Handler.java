package com.hua.chain;

/**
 * Created by limenghua on 2016/9/1.
 *
 * @author limenghua
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
