package com.hua.decorator.notifier;

/**
 * 部件 （Component） 声明封装器和被封装对象的公用接口。
 * created at 2021-11-07 08:05
 * @author lerry
 */
public interface Notifier {
	void send(String message);
}
