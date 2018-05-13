package com.hua.template.template01;

/**
 * Created by limenghua on 2017/11/14.
 * @author limenghua
 */
abstract class AbstractClass {
	// 抽象方法
	protected abstract void absMethod();

	// 钩子方法可以控制代码流程，如：返回true、false
	protected boolean hookMethod() {
		return true;
	}

	// 具体方法
	private final void concreteMethod() {
		System.out.println("父类具体方法：Base Logic Code!");
	}

	public void templateMethod() {
		absMethod();
		if (this.hookMethod()) {
			concreteMethod();
		}
	}
}

class ConcreteClass extends AbstractClass {

	@Override
	protected void absMethod() {
		System.out.println("子类：Signal Logic Code!");
	}

	@Override
	protected boolean hookMethod() {
		super.hookMethod();
		System.out.println("子类：hookMethod Logic Code!");
		return true;
	}
}

class TemplateApplication {
	public static void main(String[] args) {
		AbstractClass abstractClass = new ConcreteClass();
		abstractClass.templateMethod();
	}
}
