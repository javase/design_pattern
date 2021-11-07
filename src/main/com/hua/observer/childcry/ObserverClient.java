package com.hua.observer.childcry;

/**
 * 有很多时候，观察者需要根据事件的具体情况来进行处理
 * 大多数时候，我们处理事件的时候，需要事件源对象
 * 事件也可以形成继承体系
 */
public class ObserverClient {
	public static void main(String[] args) {
		Child c = new Child();
		//do sth
		c.wakeUp();
		System.out.println("--------");
		Bird bird = new Bird();
		bird.fly();
	}
}
