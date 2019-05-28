package com.hua.chain;

/**
 * Created by lerry on 2016/9/1.
 *
 * @author lerry
 */
public class ConcreteHandler extends Handler {

    @Override
    public void handlerRequest() {
        /**
         * 如果有后继的责任对象，就转发请求到后继的责任对象，否则，处理请求
         */
        if (getSuccessor() != null) {
            System.out.println(String.format("[%s]放过请求", this.hashCode()));
            getSuccessor().handlerRequest();
        } else {
            System.out.println(String.format("[%s]处理请求", this.hashCode()));
        }
    }
}
