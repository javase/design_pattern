package com.hua.decorator.notifier;

/**
 * created at 2021-11-07 08:10
 * @author lerry
 */
public class NotifierApplication {
	public static void main(String[] args) {
		Notifier dbNotifier = new WechatDecoratorImpl(
				new SmsDecoratorImpl(
						new DatabaseNotifier()
				)
		);
		dbNotifier.send("vvv");

		Notifier webNotifier = new QQDecoratorImpl(
				new EmailDecoratorImpl(
						new WebApplicationNotifier()
				)
		);
		webNotifier.send("vvv");

	}
}
