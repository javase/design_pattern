package com.hua.prototype;

/**
 * 原型模式
 * Created by lerry on 2017/9/26.
 * @author lerry
 */
public class PropotypeApplication {
	public static void main(String[] args) {
		ConcretePropotype concretePropotype = new ConcretePropotype();
		for (int i = 0; i < 10; i++) {
			ConcretePropotype clonePropotype = (ConcretePropotype) concretePropotype.clone();
			System.out.println(String.format("%s.---------------------------------", i + 1));
			clonePropotype.show();
			System.out.println(String.format("克隆类：%s", clonePropotype));
		}
	}
}

class Propotype implements Cloneable {

	@Override
	public Propotype clone() {
		Propotype propotype = null;
		try {
			propotype = (Propotype) super.clone();
		}
		catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return propotype;
	}
}// end class

class ConcretePropotype extends Propotype {
	public ConcretePropotype() {
		System.out.println("构造器被调用");
	}

	public void show() {
		System.out.println("原型模式实现类");
	}
}


