package com.hua.singleton.dcl;

import com.hua.singleton.lazythreadsafe.SingletonLazySafe;

/**
 * DCL（双重检验锁）式单例模式
 * Created by lerry on 2017/9/21.
 * @author lerry
 */
public class SingletonDCL {
	private volatile static SingletonDCL singleton;

	private static int counter = 0;

	private SingletonDCL() {
		counter++;
		System.out.println(String.format("构造对象被调用[%d]次", counter));
	}

	/**
	 * 双重校验锁式（也有人把双重校验锁式和懒汉式归为一类）分别在代码锁前后进行判空校验，
	 * 避免了多个有机会进入临界区的线程都创建对象，
	 * 同时也避免了后来线程在"lazythreadsafe"中，先来线程创建对象后，但仍未退出临界区的情况下等待
	 * @return
	 */
	public static SingletonDCL getInstance() {
		// 模拟同步方法的耗时  start
		try {
			System.out.printf("[%s]获取对象实例等待1秒\n", Thread.currentThread().getName());
			Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		// 模拟同步方法的耗时  end
		if (singleton == null) {
			synchronized (SingletonLazySafe.class) {
				if (singleton == null) {
					singleton = new SingletonDCL();
				}// end if
			}// end syn
		}// end if
		return singleton;
	}
}
