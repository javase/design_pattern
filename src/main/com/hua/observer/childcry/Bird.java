package com.hua.observer.childcry;

import java.util.ArrayList;
import java.util.List;

/**
 * created at 2021-11-07 17:31
 * @author lerry
 */
public class Bird {
	private List<Observer> observerList = new ArrayList<>();

	{
		observerList.add(new Dog());
	}

	public void fly() {
		System.out.println("小鸟从墙头起飞了");
		Event<Bird> flyEvent = new FlyEvent();
		for (Observer observer : observerList) {
			observer.actionOnEvent(flyEvent);
		}
	}
}
