package com.hua.decorator.notifier;

/**
 * created at 2021-11-07 08:08
 * @author lerry
 */
public class WechatDecoratorImpl extends BaseDecorator {
	public WechatDecoratorImpl(Notifier notifier) {
		super(notifier);
	}

	@Override
	public void send(String message) {
		super.send(message);
		System.out.printf("使用微信发送通知：%s\n", message);
	}
}
