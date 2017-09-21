package com.hua.singleton.dcl;

import com.hua.singleton.lazythreadsafe.Singleton;

/**
 * Created by limenghua on 2017/9/21.
 * @author limenghua
 */
public class SingletonDCL {

	private volatile static SingletonDCL singleton;

	private static int counter = 0;

	private SingletonDCL() {
		counter++;
		System.out.println(String.format("构造对象被调用[%d]次", counter));
	}

	public static SingletonDCL getInstance() {
		if (singleton == null) {
			synchronized (Singleton.class) {

				if (singleton == null) {
					// 模拟同步方法的耗时  start
					try {
						Thread.sleep(1000);
					}
					catch (InterruptedException e) {
						e.printStackTrace();
					}
					// 模拟同步方法的耗时  end

					singleton = new SingletonDCL();
				}// end if
			}// end syn
		}// end if
		return singleton;
	}

}
