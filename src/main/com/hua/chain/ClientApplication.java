package com.hua.chain;

/**
 * Created by lerry on 2016/9/1.
 * 职责链模式
 * 使多个对象都有机会处理请求，从而避免请求的发送者和接受者之间的耦合关系，
 * 将这个对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理他为止。
 *
 * @author lerry
 */
public class ClientApplication {
    public static void main(String[] args) {
        Handler handler01 = new ConcreteHandler();
        Handler handler02 = new ConcreteHandler();
        // 02 是01的后继处理者
        handler01.setSuccessor(handler02);

        System.out.println(String.format("handler01's hashcode:[%s]", handler01.hashCode()));
        System.out.println(String.format("handler02's hashcode:[%s]", handler02.hashCode()));
        //提交请求
        handler01.handlerRequest();
    }
}
