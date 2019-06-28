package com.hua.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by lerry on 2017/4/27.<br/>
 * 动态代理模式 <br/>
 * 动态代理：代理类是在运行时生成的。也就是说 Java 编译完之后并没有实际的 class 文件，而是在运行时动态生成的类字节码，并加载到JVM中。<br/>
 * Java实现动态代理的大致步骤如下：<br/>
 * 1. 定义一个委托类和公共接口。<br/>
 * 2. 自己定义一个类（调用处理器类，即实现 InvocationHandler 接口），这个类的目的是指定运行时将生成的代理类需要完成的具体任务（包括Preprocess和Postprocess），即代理类调用任何方法都会经过这个调用处理器类。<br/>
 * 3. 生成代理对象（当然也会生成代理类），需要为他指定(1)委托对象(2)实现的一系列接口(3)调用处理器类的实例。因此可以看出一个代理对象对应一个委托对象，对应一个调用处理器实例。<br/>
 * <p/>
 * Java 实现动态代理主要涉及以下几个类：<br/>
 * 1. java.lang.reflect.Proxy: 这是生成代理类的主类，通过 Proxy 类生成的代理类都继承了 Proxy 类，即 DynamicProxyClass extends Proxy。<br/>
 * 2. java.lang.reflect.InvocationHandler: 这里称他为"调用处理器"，他是一个接口，我们动态生成的代理类需要完成的具体内容需要自己定义一个类，而这个类必须实现 InvocationHandler 接口。<br/>
 */
public class DynamicProxyApplication {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();// 创建委托对象
        ProxyHandler handler = new ProxyHandler(realSubject);
        // 动态生成代理对象
        Subject proxySubject = (Subject) Proxy.newProxyInstance(RealSubject.class.getClassLoader(), RealSubject.class.getInterfaces(), handler);
        // 通过代理对象调用方法
        proxySubject.request();
    }
}

/**
 * 接口
 */
interface Subject {
    void request();
}

/**
 * 委托类
 */
class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("RealSubject Request");
    }
}

class ProxyHandler implements InvocationHandler {

    private Subject subject;

    public ProxyHandler(Subject subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 定义预处理的工作，可以根据method的不同进行不同的处理工作
        System.out.println("before");
        Object result = method.invoke(subject, args);
        System.out.println("after");
        return result;
    }
}