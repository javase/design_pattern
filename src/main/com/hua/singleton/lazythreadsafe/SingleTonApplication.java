package com.hua.singleton.lazythreadsafe;


/**
 * Created by limenghua on 2017/9/21.
 * @author limenghua
 */
public class SingleTonApplication {

	public static void main(String[] args) {

		int createTimes = 100;

		// 检测线程安全性
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				Singleton.getInstance();
			}
		};

		long start = System.currentTimeMillis();
		for (int i = 0; i < createTimes; i++) {
			Thread thread = new Thread(runnable);
			thread.start();
		}// end for
		System.out.println(String.format("获取对象[%d]次耗时：[%dms]", createTimes, (System.currentTimeMillis() - start)));

	}// end main
}
