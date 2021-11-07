package com.hua.decorator.notifier;

/**
 * created at 2021-11-07 08:05
 * @author lerry
 */
public abstract class BaseDecorator implements Notifier {

	protected Notifier notifier;

	public BaseDecorator(Notifier notifier) {
		this.notifier = notifier;
	}

	@Override
	public void send(String message) {
		this.notifier.send(message);
	}
}
