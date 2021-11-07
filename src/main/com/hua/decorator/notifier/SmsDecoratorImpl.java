package com.hua.decorator.notifier;

/**
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
