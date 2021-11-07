package com.hua.decorator.notifier;

/**
 * created at 2021-11-07 08:16
 * @author lerry
 */
public class DatabaseNotifier implements Notifier {
	@Override
	public void send(String message) {
		System.out.println("MySQL数据库报警");
	}
}
