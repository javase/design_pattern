package com.hua.decorator.notifier;

/**
 * created at 2021-11-07 08:16
 * @author lerry
 */
public class WebApplicationNotifier implements Notifier {
	@Override
	public void send(String message) {
		System.out.println("Java应用报警");
	}
}
