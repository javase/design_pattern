package com.hua.singleton.lazy;

/**
 * 单例模式-懒汉式-非线程安全
 * 顾名思义，lazy loading（延迟加载，一说懒加载），
 * 在需要的时候才创建单例对象，
 * 而不是随着软件系统的运行或者当类被加载器加载的时候就创建。
 * 当单例类的创建或者单例对象的存在会消耗比较多的资源，常常采用lazy loading策略。
 * 这样做的一个明显好处是提高了软件系统的效率，节约内存资源。
 * Created by limenghua on 2017/9/21.
 * @author limenghua
 */
public class SingleTonApplication {

	/**
	 * 简单的懒汉式在多线程环境下不是线程安全的。
	 * @param args
	 */
	public static void main(String[] args) {
		// 检测线程安全性
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				SingletonLazy singletonLazy = SingletonLazy.getInstance();
				System.out.println(String.format("[%s]线程打印当前对象：%s", Thread.currentThread().getName(), singletonLazy.toString()));
			}
		};
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread(runnable);
			thread.start();
		}// end for

	}// end main
}
