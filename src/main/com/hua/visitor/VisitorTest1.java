package com.hua.visitor;

/**
 * Created by lerry on 2018/3/2.
 * @author lerry
 */
public class VisitorTest1 {
	public static void main(String[] args) {
		A a = new A();
		a.method1();
		a.method2(new B());
	}
}

class A {
	public void method1() {
		System.out.println("我是A");
	}

	public void method2(B b) {
		b.showA(this);
	}

}

class B {
	public void showA(A a) {
		a.method1();
	}
}