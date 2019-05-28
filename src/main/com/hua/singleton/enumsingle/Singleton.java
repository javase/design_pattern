package com.hua.singleton.enumsingle;

/**
 * 默认的枚举实例的创建是线程安全的，但是实例内的各种方法则需要程序员来保证线程安全。
 * 总的来说，使用枚举单例模式，有三个好处：
 * 1.实例的创建线程安全，确保单例。
 * 2.防止被反射创建多个实例。
 * 3.没有序列化的问题。
 * Created by lerry on 2017/9/21.
 * @author lerry
 */
public enum Singleton {
	INSTANCE {
		public void work() {
			// 模拟同步方法的耗时  start
			try {
				System.out.println("调用work方法等待1秒");
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			// 模拟同步方法的耗时  end
			System.out.println("这里是枚举中的方法");
		}
	};

	protected abstract void work();
}
