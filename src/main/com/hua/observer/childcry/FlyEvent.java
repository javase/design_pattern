package com.hua.observer.childcry;

/**
 * created at 2021-11-07 17:33
 * @author lerry
 */
public class FlyEvent extends Event<Bird> {
	public FlyEvent(Bird source) {
		this.source = source;
	}

	private Bird source;

	@Override
	Bird getSource() {
		return source;
	}
}
