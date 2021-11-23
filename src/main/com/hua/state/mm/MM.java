package com.hua.state.mm;

/**
 * 上下文 （Context） 保存了对于一个具体状态对象的引用， 并会将所有与该状态相关的工作委派给它。
 * 上下文通过状态接口与状态对象交互， 且会提供一个设置器用于传递新的状态对象。
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
