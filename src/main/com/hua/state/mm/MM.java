package com.hua.state.mm;

/**
 * 当增加新的状态时非常不方便
 */

public class MM {
	private String name;

	private MMState state ;

	public void changeState(MMState state) {
		this.state = state;
	}

	public MM(String name, MMState state) {
		this.name = name;
		this.state = state;
	}

	public void smile() {
		state.smile();
	}

	public void cry() {
		state.cry();
	}

	public void say() {
		state.say();
	}

}
