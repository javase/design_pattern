package com.hua.singleton.lazy;

/**
 * Created by lerry on 2017/9/21.
 * @author lerry
 */
public class SingletonLazy {

	private static SingletonLazy singleton = null;

	private static int counter = 0;

	private SingletonLazy() {
		counter++;
		System.out.println(String.format("线程[%s]调用构造器，对象被创建[%d]次", Thread.currentThread().getName(), counter));
	}

	public static SingletonLazy getInstance() {
		if (singleton == null) {
			singleton = new SingletonLazy();
		}
		return singleton;
	}

}
