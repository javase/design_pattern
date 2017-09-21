package com.hua.singleton.lazythreadsafe;

/**
 * Created by limenghua on 2017/9/21.
 * @author limenghua
 */
public class Singleton {

	private static Singleton singleton = null;

	private static int counter = 0;

	private Singleton() {
		counter++;
		System.out.println(String.format("构造对象被调用[%d]次", counter));
	}

	/**
	 * 当有多个线程几乎同时访问getInstance方法时，多个线程必须有次序地进入方法内，
	 * 这样导致了若干个线程需要耗费等待进入临界区（被锁住的代码块）的时间。
	 * @return
	 */
	public static synchronized Singleton getInstance() {
		// 模拟同步方法的耗时  start
		try {
			System.out.println("获取对象实例等待1秒");
			Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		// 模拟同步方法的耗时  end
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}

}
