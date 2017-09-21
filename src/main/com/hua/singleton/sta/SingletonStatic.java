package com.hua.singleton.sta;

/**
 * Created by limenghua on 2017/9/21.
 * @author limenghua
 */
public class SingletonStatic {

	private static int counter = 0;

	private SingletonStatic() {
		counter++;
		System.out.println(String.format("构造对象被调用[%d]次", counter));
	}

	private static class SingletonHolder {
		private static final SingletonStatic INSTANCE = new SingletonStatic();
	}

	public static final SingletonStatic getInstance() {
		return SingletonHolder.INSTANCE;
	}
}
