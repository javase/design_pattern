package com.hua.singleton.sta;

/**
 * 静态内部类即使SingletonStatic类被加载也不会创建单例对象，
 * 除非调用里面的getInstance()方法
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
