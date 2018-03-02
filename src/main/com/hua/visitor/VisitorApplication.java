package com.hua.visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by limenghua on 2018/3/2.
 * @author limenghua
 */
public class VisitorApplication {
	public static void main(String[] args) {
		List<Element> list = ObjectStructure.getList();
		for (Element element : list) {
			element.accept(new Visitor());
		}// end for
	}// end main
}

abstract class Element {
	public abstract void accept(IVisitor iVisitor);

	public abstract void doSomething();
}

interface IVisitor {
	void visit(ConcreteElement1 element1);

	void visit(ConcreteElement2 element2);
}

class ConcreteElement1 extends Element {

	@Override
	public void accept(IVisitor iVisitor) {
		iVisitor.visit(this);
	}

	@Override
	public void doSomething() {
		System.out.println("这是元素1的实现类");
	}
}

class ConcreteElement2 extends Element {

	@Override
	public void accept(IVisitor iVisitor) {
		iVisitor.visit(this);
	}

	@Override
	public void doSomething() {
		System.out.println("这是元素2的实现类");
	}
}

class Visitor implements IVisitor {

	@Override
	public void visit(ConcreteElement1 element1) {
		element1.doSomething();
	}

	@Override
	public void visit(ConcreteElement2 element2) {
		element2.doSomething();
	}
}

class ObjectStructure {
	public static List<Element> getList() {
		List<Element> list = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			int a = random.nextInt(100);
//			System.out.println(a);
			if (a > 50) {
				list.add(new ConcreteElement1());
			}
			else {
				list.add(new ConcreteElement2());
			}
		}
		return list;
	}
}