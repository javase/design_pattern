package com.hua.decorator.notifier;

/**
 * 具体部件 （Concrete Component） 类是被封装对象所属的类。 它定义了基础行为， 但装饰类可以改变这些行为。
 * created at 2021-11-07 08:16
 * @author lerry
 */
public class WebApplicationNotifier implements Notifier {
	@Override
	public void send(String message) {
		System.out.println("Java应用报警");
	}
}
