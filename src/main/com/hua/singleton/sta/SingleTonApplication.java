package com.hua.singleton.sta;


/**
 * Created by lerry on 2017/9/21.
 * @author lerry
 */
public class SingleTonApplication {

	public static void main(String[] args) {
		// 检测线程安全性
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				SingletonStatic singleton = SingletonStatic.getInstance();
				System.out.println(String.format("[%s]线程打印当前对象：%s", Thread.currentThread().getName(), singleton.toString()));
			}
		};
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread(runnable);
			thread.start();
		}// end for

	}// end main
}
