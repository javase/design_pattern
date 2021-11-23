package com.hua.state.mm;

/**
 * 状态 （State） 接口会声明特定于状态的方法。
 * 这些方法应能被其他所有具体状态所理解， 因为你不希望某些状态所拥有的方法永远不会被调用。
 */
public abstract class MMState {
	abstract void smile();

	abstract void cry();

	abstract void say();
}
