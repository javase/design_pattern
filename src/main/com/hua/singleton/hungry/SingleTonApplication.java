package com.hua.singleton.hungry;


/**
 * Created by limenghua on 2017/9/21.
 * @author limenghua
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
		}// end for

	}// end main
}
