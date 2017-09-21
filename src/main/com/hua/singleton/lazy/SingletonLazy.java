package com.hua.singleton.lazy;

/**
 * Created by limenghua on 2017/9/21.
 * @author limenghua
 */
public class SingletonLazy {

	private static SingletonLazy singleton = null;

	private static int counter = 0;

	private SingletonLazy() {
		counter++;
		System.out.println(String.format("构造对象被调用[%d]次", counter));
	}

	public static SingletonLazy getInstance() {
		if (singleton == null) {
			singleton = new SingletonLazy();
		}
		return singleton;
	}

}
