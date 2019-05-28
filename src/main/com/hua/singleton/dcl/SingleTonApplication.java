package com.hua.singleton.dcl;


import java.util.concurrent.CountDownLatch;

/**
 * Created by lerry on 2017/9/21.
 * @author lerry
 */
public class SingleTonApplication {

	public static void main(String[] args) throws InterruptedException {
		int createTimes = 10;
		final CountDownLatch latch = new CountDownLatch(createTimes);

		// 检测线程安全性
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				SingletonDCL singleton = SingletonDCL.getInstance();
				System.out.println(String.format("[%s]线程打印当前对象：%s", Thread.currentThread().getName(), singleton.toString()));
				latch.countDown(); // 将count值减1
			}
		};

		long start = System.currentTimeMillis();

		for (int i = 0; i < createTimes; i++) {
			Thread thread = new Thread(runnable);
			thread.start();
		}// end for

		// 等待所有线程完成工作
		latch.await();
		System.out.println(String.format("获取对象[%d]次耗时：[%dms]", createTimes, (System.currentTimeMillis() - start)));

	}// end main
}
