package com.hua.template.template_with_hook;


import static com.hua.util.Print.*;

/**
 * 模板方法模式
 */
public class TemplateApplication {
	public static void main(String[] args) {
		AbstractClass abstractClass = new ConcreteClass();
		abstractClass.templateMethod();
	}
}

/**
 * Created by lerry on 2017/11/14.
 * @author lerry
 */
abstract class AbstractClass {
	/**
	 * 抽象方法
	 */
	protected abstract void absMethod();

	/**
	 * 钩子方法可以控制代码流程，如：返回true、false
	 * @return
	 */
	protected boolean hookMethod() {
		print("父类钩子方法，固定返回true");
		return true;
	}

	/**
	 * 具体方法
	 */
	private final void concreteMethod() {
		System.out.println("父类具体方法：Base Logic Code!");
	}

	/**
	 * 模板方法
	 */
	public void templateMethod() {
		absMethod();
		// 在模板方法中，添加了根据不同条件，执行不同逻辑代码的流程控制。
		if (this.hookMethod()) {
			concreteMethod();
		}
	}
}

/**
 * 具体实现类
 */
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

