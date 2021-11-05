package com.hua.singleton.hungry;


import java.io.IOException;

/**
 * 使用多个线程同时获取单例类的实例，观察是否只会创建一个对象
 * Created by lerry on 2017/9/21.
 * @author lerry
 */
public class SingleTonApplication {

	public static void main(String[] args) {
		// 检测线程安全性
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				SingletonHungry.getInstance();
			}
		};
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread(runnable);
			thread.start();
			System.out.printf("线程:[%s]开始运行\n", thread.getName());
		}// end for

		try {
			System.in.read();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}// end main
}
