package com.hua.observer.childcry;

/**
 * 观察者、订阅者
 */
interface Observer {
	/**
	 * 观察的是一个事件。
	 * 做出一系列反应
	 * @param event
	 */
	void actionOnEvent(Event event);
}