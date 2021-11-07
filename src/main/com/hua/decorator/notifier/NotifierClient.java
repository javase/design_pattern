package com.hua.decorator.notifier;

/**
 * 客户端 （Client） 可以使用多层装饰来封装部件， 只要它能使用通用接口与所有对象互动即可。
 * created at 2021-11-07 08:10
 * @author lerry
 */
public class NotifierClient {
	public static void main(String[] args) {
		Notifier dbNotifier = new WechatDecoratorImpl(
				new SmsDecoratorImpl(
						new DatabaseNotifier()
				)
		);
		dbNotifier.send("vivivi...");

		System.out.println("------------------------");
		Notifier webNotifier = new QQDecoratorImpl(
				new EmailDecoratorImpl(
						new WebApplicationNotifier()
				)
		);
		webNotifier.send("dididi...");
	}
}
