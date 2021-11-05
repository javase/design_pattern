package com.hua.singleton.enumsingle;

import java.util.concurrent.CountDownLatch;

/**
 * Created by lerry on 2017/9/21.
 * @author lerry
 */
public class SingleTonApplication {

	public static void main(String[] args) throws InterruptedException {

		int createTimes = 10;

		final CountDownLatch latch = new CountDownLatch(createTimes);
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println(String.format("打印当前枚举对象的hashCode：%s", Singleton.INSTANCE.hashCode()));
				Singleton.INSTANCE.work();
				latch.countDown();
			}
		};
		long start = System.currentTimeMillis();
		for (int i = 0; i < createTimes; i++) {
			Thread thread = new Thread(runnable);
			thread.start();
		}// end for

		latch.await(); // 等待所有线程执行完
		System.out.println(String.format("获取对象[%d]次耗时：[%dms]", createTimes, (System.currentTimeMillis() - start)));
	}
}
