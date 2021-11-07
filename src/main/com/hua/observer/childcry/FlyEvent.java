package com.hua.observer.childcry;

/**
 * created at 2021-11-07 17:33
 * @author lerry
 */
public class FlyEvent extends Event<Bird> {
	private Bird bird;

	@Override
	Bird getSource() {
		return bird;
	}
}
