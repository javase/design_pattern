package com.hua.observer.childcry;

import java.util.ArrayList;
import java.util.List;

/**
 * Source对象
 * 持有所有的观察者（订阅者）
 * 相当于发布者（Publisher）
 */
class Child {
	private boolean cry = false;

	private List<Observer> observers = new ArrayList<>();

	{
		observers.add(new Dad());
		observers.add(new Mum());
		observers.add(new Dog());
		observers.add((e) -> {
			System.out.println("ppp");
		});
		//hook callback function
	}

	public boolean isCry() {
		return cry;
	}

	public void wakeUp() {
		cry = true;
		System.out.println("宝宝醒了");
		WakeUpEvent event = new WakeUpEvent(System.currentTimeMillis(), "bed", this);

		for (Observer o : observers) {
			o.actionOnWakeUp(event);
		}
	}
}