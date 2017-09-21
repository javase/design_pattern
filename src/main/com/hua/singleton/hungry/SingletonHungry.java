package com.hua.singleton.hungry;

/**
 * Created by limenghua on 2017/9/21.
 * @author limenghua
 */
public class SingletonHungry {

	private static SingletonHungry singleton = new SingletonHungry();

	private static int counter = 0;

	private SingletonHungry() {
		counter++;
		System.out.println(String.format("构造对象被调用[%d]次", counter));
	}

	public static SingletonHungry getInstance() {
		return singleton;
	}

}
