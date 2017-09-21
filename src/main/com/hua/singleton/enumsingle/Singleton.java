package com.hua.singleton.enumsingle;

/**
 * Created by limenghua on 2017/9/21.
 * @author limenghua
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
