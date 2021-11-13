package com.hua.command;

/**
 * Created by lerry on 2017/7/18.
 * 具体命令 （Concrete Commands） 会实现各种类型的请求。
 * 具体命令自身并不完成工作， 而是会将调用委派给一个业务逻辑对象。(调用Stock的方法)
 * 但为了简化代码， 这些类可以进行合并。
 * 接收对象执行方法所需的参数可以声明为具体命令的成员变量。
 * 你可以将命令对象设为不可变， 仅允许通过构造函数对这些成员变量进行初始化。
 * @author lerry
 */
public class SellStock implements Order {
	private final Stock stock;

	public SellStock(Stock stock) {
		this.stock = stock;
	}

	@Override
	public void execute() {
		stock.sell();
	}
}
