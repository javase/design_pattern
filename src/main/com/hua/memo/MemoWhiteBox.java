package com.hua.memo;

/**
 * 白箱备忘录模式
 * Created by lerry on 2018/2/26.
 * @author lerry
 */

/**
 * 备忘录角色
 */
class Memento {
	private String state;

	public Memento(String state) {
		this.state = state;
	}

	public String getState() {
		return this.state;

	}

	public void setState(String state) {
		this.state = state;
	}
}

class Originator {

	private String state;

	//工厂方法，返回一个新的备忘录对象
	public Memento createMemento() {

		return new Memento(state);

	}


	//将发起人恢复到备忘录对象所记载的状态
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

/**
 * 负责存储备忘录
 */
class Caretaker {
	private Memento memento;


	public Memento retrieveMemento() {

		return this.memento;

	}


	public void saveMemento(Memento memento) {

		this.memento = memento;

	}

}

public class MemoWhiteBox {
	public static void main(String[] args) {

		Originator originator = new Originator();

		Caretaker caretaker = new Caretaker();

		//改变发起人的状态
		originator.setState("on");

		originator.getState();

		//创建备忘录对象，并将发起人对象的状态存储起来
		caretaker.saveMemento(originator.createMemento());

		//再次改变发起人对象的状态
		originator.setState("off");

		originator.getState();

		//恢复发起人对象的状态
		originator.restoreMemento(caretaker.retrieveMemento());

		originator.getState();

	}
}
