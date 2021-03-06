package com.hua.singleton.hungry;


import static com.hua.util.Print.*;

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
				SingletonHungry.getInstance();
			}
		};
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread(runnable);
			thread.start();
			printlnf("线程:[%s]开始运行", thread.getName());
		}// end for

	}// end main
}
