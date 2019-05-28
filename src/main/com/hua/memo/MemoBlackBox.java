package com.hua.memo;

import java.util.Vector;

/**
 * 黑箱备忘录模式
 * Created by lerry on 2018/2/26.
 * @author lerry
 */

interface MementoIF {

}

class Originator2 {

	protected class Memento implements MementoIF {
		private Vector<Object> saveStates;

		private int saveIndex;

		private Memento(Vector<Object> saveStates, int saveIndex) {
			//保存客户端传来的状态对象的拷贝，否则客户端的修改会影响到保存的状态。
			this.saveStates = (Vector<Object>) saveStates.clone();
			this.saveIndex = saveIndex;
		}

		private Vector<Object> getSaveStates() {
			return saveStates;
		}

		private int getSaveIndex() {
			return saveIndex;
		}
	}

	private Vector<Object> states;

	private int index;

	public Originator2() {
		this.states = new Vector<>();
		this.index = 0;
	}

	/**
	 * 工厂方法，返回一个新的备忘录
	 * @return
	 */
	public MementoIF createMemento() {
		return new Memento(this.states, this.index);
	}

	public void restoreMemento(MementoIF mementoIF) {
		this.states = ((Memento) mementoIF).getSaveStates();
		this.index = ((Memento) mementoIF).getSaveIndex();
	}

	public void setStates(Object state) {
		this.states.addElement(state);
		index++;
	}

	public void printAllStates() {
		System.out.println("Total number of states:" + this.index);
		for (Object state : this.states) {
			System.out.println(state);
		}
	}
}


/**
 * 对外部来说Memento对象的内容都是不可见的。
 */
class CareTaker2 {
	private Originator2 originator2;

	private Vector<MementoIF> mementos = new Vector<>();

	private int currentIndex;

	public CareTaker2(Originator2 originator2) {
		this.originator2 = originator2;
		currentIndex = 0;
	}

	public void createMemento() {
		mementos.addElement(originator2.createMemento());
		currentIndex++;
	}

	public void restoreMemento(int index) {
		originator2.restoreMemento(mementos.elementAt(index));
	}

	public void removeMemento(int index) {
		mementos.removeElementAt(index);
	}
}

/**
 * “黑箱”备忘录模式
 “黑箱”备忘录模式相比“白箱”备忘录模式有如下区别：
 1.将Memento设成Originator类的内部类；
 2.将Memento的方法全部设成私有方法，这样只有它自己和发起人Originator可以调用；
 3.在外部提供一个标识接口MementoIF给Caretaker以及其他对象，标识接口MementoIF没有提供任何方法，
 因此对外部来说Memento对象的内容都是不可见的。
 */
public class MemoBlackBox {
	public static void main(String[] args) {
		Originator2 originator2 = new Originator2();
		CareTaker2 careTaker2 = new CareTaker2(originator2);

		originator2.setStates("state0");
		// 创建一个检查点（备忘录）
		careTaker2.createMemento();

		originator2.setStates("state1");
		careTaker2.createMemento();

		originator2.setStates("state2");
		careTaker2.createMemento();

		originator2.setStates("state3");
		careTaker2.createMemento();

		originator2.setStates("state4");
		careTaker2.createMemento();

		System.out.println("初始化状态：\n---------------------");
		originator2.printAllStates();

		System.out.println("restore to index 3\n---------------------");
		careTaker2.restoreMemento(3);
		originator2.printAllStates();

		System.out.println("restore to index 0\n---------------------");
		careTaker2.restoreMemento(0);
		originator2.printAllStates();

		System.out.println("restore to index 4\n---------------------");
		careTaker2.restoreMemento(4);
		originator2.printAllStates();
	}
}


