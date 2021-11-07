package com.hua.decorator.notifier;

/**
 * created at 2021-11-07 08:08
 * @author lerry
 */
public class EmailDecoratorImpl extends BaseDecorator {
	public EmailDecoratorImpl(Notifier notifier) {
		super(notifier);
	}

	@Override
	public void send(String message) {
		super.send(message);
		System.out.printf("使用邮件发送通知：%s\n", message);
	}
}
