package com.hua.memento.white;


/**
 * 白箱备忘录模式
 * Created by lerry on 2018/2/26.
 * @author lerry
 */
public class MementoWhiteBoxClient {
	public static void main(String[] args) {

		Originator originator = new Originator();
		Caretaker caretaker = new Caretaker(originator);

		//改变发起人的状态
		originator.setState("on");
		originator.getState();

		//创建备忘录对象，并将发起人对象的状态存储起来
		caretaker.save();
		/* 多次改变发起人对象的状态 */
		originator.setState("off");
		originator.getState();
		caretaker.save();

		originator.setState("off");
		originator.getState();
		caretaker.save();

		originator.setState("on");
		originator.getState();
		caretaker.save();
		/**/

		System.out.println("------------------------------------");
		//恢复发起人对象的状态
		originator.restoreMemento(caretaker.undo());
		System.out.println("从备忘录恢复：");
		originator.getState();

		originator.restoreMemento(caretaker.undo());
		System.out.println("从备忘录恢复：");
		originator.getState();

		originator.restoreMemento(caretaker.undo());
		System.out.println("从备忘录恢复：");
		originator.getState();

		originator.restoreMemento(caretaker.undo());
		System.out.println("从备忘录恢复：");
		originator.getState();

	}
}





