package com.hua.decorator.notifier;

/**
 * 基础装饰 （Base Decorator） 类拥有一个指向被封装对象的引用成员变量。
 * 该变量的类型应当被声明为通用部件接口， 这样它就可以引用具体的部件和装饰。 装饰基类会将所有操作委派给被封装的对象。
 * created at 2021-11-07 08:05
 * @author lerry
 */
public abstract class BaseDecorator implements Notifier {

	/**
	 * 通用部件接口
	 */
	protected Notifier notifier;

	public BaseDecorator(Notifier notifier) {
		this.notifier = notifier;
	}

	@Override
	public void send(String message) {
		this.notifier.send(message);
	}
}
