package com.hua.template.template01;

/**
 * Created by limenghua on 2017/11/14.
 * @author limenghua
 */
abstract class AbstractClass {
	// 抽象方法
	protected abstract void absMethod();

	protected void hookMethod() {

	}

	// 具体方法
	private final void concreteMethod() {
		System.out.println("父类：Base Logic Code!");
	}

	public void templateMethod() {
		absMethod();
		hookMethod();
		concreteMethod();
	}
}

class ConcreteClass extends AbstractClass {

	@Override
	protected void absMethod() {
		System.out.println("子类：Signal Logic Code!");
	}

	@Override
	protected void hookMethod() {
		super.hookMethod();
		System.out.println("子类：hookMethod Logic Code!");
	}
}

class TemplateApplication {
	public static void main(String[] args) {
		AbstractClass abstractClass = new ConcreteClass();
		abstractClass.templateMethod();
	}
}
