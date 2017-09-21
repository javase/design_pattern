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

	public static synchronized Singleton getInstance() {
		if (singleton == null) {

			// 模拟同步方法的耗时  start
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			// 模拟同步方法的耗时  end

			singleton = new Singleton();
		}
		return singleton;
	}

}
