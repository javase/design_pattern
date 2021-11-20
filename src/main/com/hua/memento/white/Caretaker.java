package com.hua.memento.white;

import java.util.Stack;

/**
 * 负责存储备忘录
 * 负责人 （Caretaker） 仅知道 “何时” 和 “为何” 捕捉原发器的状态， 以及何时恢复状态。
 * 负责人通过保存备忘录栈来记录原发器的历史状态。
 * 当原发器需要回溯历史状态时， 负责人将从栈中获取最顶部的备忘录， 并将其传递给原发器的恢复 （restoration） 方法。
 */
class Caretaker {

	private Originator originator;

	public Caretaker(Originator originator) {
		this.originator = originator;
	}

	//	private Memento[] history;
	private Stack<Memento> history;

	/**
	 * 恢复
	 * @return
	 */
	public Memento undo() {
		return history.pop();
	}


	public void save() {
		if (history == null) {
			history = new Stack<>();
		}
		Memento memento = originator.createMemento();
		history.push(memento);
	}

	public void doSomething() {
		String msg = "just do something";
		System.out.println(msg);
	}

}
