package com.hua.memento.white;

/**
 * 备忘录角色
 * 备忘录 （Memento） 是原发器状态快照的值对象 （value object）。
 * 通常做法是将备忘录设为不可变的， 并通过构造函数一次性传递数据。
 */
class Memento {
	private String state;

	public Memento(String state) {
		this.state = state;
	}

	public String getState() {
		return this.state;

	}

}
