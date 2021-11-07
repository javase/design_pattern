package com.hua.decorator.notifier;

/**
 * 具体装饰类 （Concrete Decorators） 定义了可动态添加到部件的额外行为。
 * 具体装饰类会重写装饰基类的方法， 并在调用父类方法之前或之后进行额外的行为。
 * created at 2021-11-07 08:08
 * @author lerry
 */
public class SmsDecoratorImpl extends BaseDecorator {
	public SmsDecoratorImpl(Notifier notifier) {
		super(notifier);
	}

	@Override
	public void send(String message) {
		super.send(message);
		System.out.printf("使用短信发送通知：%s\n", message);
	}
}
