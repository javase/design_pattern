package com.hua.principle.single;

/**
 * <pre>
 * 单一职责原则
 * 程序上线后，发现问题了，并不是所有的动物都呼吸空气的，比如鱼就是呼吸水的。
 * 修改时如果遵循单一职责原则，需要将Animal类细分为陆生动物类Terrestrial，
 * 水生动物Aquatic，代码如：AnimalTwoApplication
 * </pre>
 * Created by lerry on 2018/3/2.
 * @author lerry
 */
public class AnimalApplication {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.breathe("牛");
		animal.breathe("羊");
		animal.breathe("鸡");
	}
}

class Animal {
	public void breathe(String animal) {
		System.out.println(String.format("%s呼吸空气", animal));
	}
}
