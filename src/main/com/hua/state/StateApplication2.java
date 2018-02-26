package com.hua.state;

/**
 * Created by limenghua on 2018/2/26.
 * @author limenghua
 * <a href="https://www.cnblogs.com/java-my-life/archive/2012/06/08/2538146.html">《JAVA与模式》之状态模式</a>
 */
public class StateApplication2 {
	public static void main(String[] args) {
		// 创建状态
		ConcreteStateA stateA = new ConcreteStateA();
		ConcreteStateB stateB = new ConcreteStateB();

		// 创建环境
		Context2 context2 = new Context2();
		context2.setState2(stateA);
		context2.request("test");

		context2.setState2(stateB);
		context2.request("test");
	}
}

interface State2 {
	void handle(String sampleParameter);
}

class ConcreteStateA implements State2 {

	@Override
	public void handle(String sampleParameter) {
		System.out.println("ConcreteStateA.handle:" + sampleParameter);
	}
}

class ConcreteStateB implements State2 {

	@Override
	public void handle(String sampleParameter) {
		System.out.println("ConcreteStateB.handle:" + sampleParameter);
	}
}

class Context2 {
	private State2 state2;

	public void setState2(State2 state2) {
		this.state2 = state2;
	}

	/**
	 * 环境类Context的行为request()是委派给某一个具体状态类的。
	 * 通过使用多态性原则，可以动态改变环境类Context的属性State的内容，
	 * 使其从指向一个具体状态类变换到指向另一个具体状态类，
	 * 从而使环境类的行为request()由不同的具体状态类来执行。
	 * @param sampleParameter
	 */
	public void request(String sampleParameter) {
		state2.handle(sampleParameter);
	}
}


