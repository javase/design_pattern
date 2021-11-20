package com.hua.memento.white;

/**
 * 原发器 （Originator） 类可以生成自身状态的快照， 也可以在需要时通过快照恢复自身状态。
 */
class Originator {

	private String state;

	/**
	 * 工厂方法，返回一个新的备忘录对象
	 * @return
	 */
	public Memento createMemento() {

		return new Memento(state);

	}


	/**
	 * 将发起人恢复到备忘录对象所记载的状态
	 * @param memento
	 */
	public void restoreMemento(Memento memento) {

		this.state = memento.getState();

	}


	public String getState() {

		System.out.println("Current state:" + state);

		return this.state;

	}


	public void setState(String state) {

		this.state = state;

	}

}
