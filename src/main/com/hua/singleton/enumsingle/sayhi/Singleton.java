package com.hua.singleton.enumsingle.sayhi;

public class Singleton {
	/**
	 * 枚举类型是线程安全的，并且只会装载一次
	 */
	private enum SingletonEnum {
		INSTANCE;

		/**
		 * 声明单例对象
		 */
		private final Singleton instance;

		/**
		 * 实例化
		 */
		SingletonEnum() {
			instance = new Singleton();
		}

		private Singleton getInstance() {
			return instance;
		}
	}

	/**
	 * 获取实例（单例对象）
	 * @return
	 */
	public static Singleton getInstance() {
		return SingletonEnum.INSTANCE.getInstance();
	}

	private Singleton() {
	}

	/**
	 * 类方法
	 */
	public void sayHi() {
		System.out.println("Hi,Java.");
	}
}

class SingletonTest {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		singleton.sayHi();

		for (int i = 0; i < 10; i++) {
			new Thread(() -> {
				System.out.println(Singleton.getInstance().hashCode());
			}).start();
		}
	}
}