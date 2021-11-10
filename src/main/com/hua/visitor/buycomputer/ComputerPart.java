package com.hua.visitor.buycomputer;

/**
 * 元素 （Element） 接口声明了一个方法来 “接收” 访问者。
 * 该方法必须有一个参数被声明为访问者接口类型。
 */
abstract class ComputerPart {
	/**
	 * 该方法必须有一个参数被声明为访问者接口类型
	 * @param v 访问者接口类型
	 */
	abstract void accept(Visitor v);

	/**
	 * some other operations eg:getName getBrand
	 */
	abstract double getPrice();
}