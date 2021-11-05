package com.hua.singleton.lazy;

/**
 * lazy loading
 * 懒汉式
 * 虽然达到了按需初始化的目的，但却带来线程不安全的问题
 * Created by lerry on 2017/9/21.
 * @author lerry
 */
public class SingletonLazy {

	private static SingletonLazy singleton = null;

	// private volatile int counter;

	private SingletonLazy() {
//		synchronized (this) {
//			++counter;
//		}
		// System.out.printf("线程[%s]调用构造器，对象被创建[%d]次\n", Thread.currentThread().getName(), counter);
	}

	public static SingletonLazy getInstance() {
		if (singleton == null) {
			singleton = new SingletonLazy();
		}
		return singleton;
	}

}
