package com.hua.observer.childcry;

/**
 * 具体订阅者(具体观察者) （Concrete Subscribers） 可以执行一些操作来回应发布者的通知。
 * 所有具体订阅者类都实现了同样的接口， 因此发布者不需要与具体类相耦合。
 */
class Dog implements Observer {

	/**
	 * 针对不同的事件源，做出不同的反应
	 * @param event
	 */
	@Override
	public void actionOnEvent(Event event) {
		if (event.getSource() instanceof Child) {
			System.out.println("dog 温柔地汪汪汪……");
		}
		if (event.getSource() instanceof Bird) {
			System.out.println("dog 很凶地汪汪汪……");
		}
	}
}