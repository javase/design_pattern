package com.hua.singleton.hungry;

/**
 * <pre>
 * 在ClassLoader加载Singleton类时，饿汉式单例就被创建。
 *  虽然饿汉式单例是线程安全的，但也有其不足之处。
 *  饿汉式单例在类被加载时就创建单例对象并且长驻内存，不管你需不需要它；
 *  如果单例类占用的资源比较多，就会降低资源利用率以及程序的运行效率。
 *  </pre>
 * Created by lerry on 2017/9/21.
 * @author lerry
 */
public class SingletonHungry {

	private static final SingletonHungry singleton = new SingletonHungry();

	public volatile int counter = 0;

	private SingletonHungry() {
		++counter;
		System.out.printf("构造方法被线程：[%s] 调用%s次 \n", Thread.currentThread().getName(), counter);
	}

	public static SingletonHungry getInstance() {
		return singleton;
	}

}
