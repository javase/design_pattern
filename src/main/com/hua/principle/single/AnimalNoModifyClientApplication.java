package com.hua.principle.single;

/**
 * <pre>
 * 直接修改类Animal来达成目的虽然违背了单一职责原则，但花销却小的多。
 * 可以看到，这种修改方式要简单的多。
 * 但是却存在着隐患：有一天需要将鱼分为呼吸淡水的鱼和呼吸海水的鱼，
 * 则又需要修改Animal类的breathe方法，而对原有代码的修改会对调用“猪”“牛”“羊”等相关功能带来风险，
 * 也许某一天你会发现程序运行的结果变为“牛呼吸水”了。
 * 这种修改方式直接在代码级别上违背了单一职责原则，虽然修改起来最简单，但隐患却是最大的。
 * 接着，看方法级别上符合单一职责原则的修改方式：AnimalSingleApplication
 * </pre>
 * Created by lerry on 2018/3/2.
 * @author lerry
 */
public class AnimalNoModifyClientApplication {
	public static void main(String[] args) {
		Animal2 animal = new Animal2();
		animal.breathe("牛");
		animal.breathe("羊");
		animal.breathe("鸡");
		animal.breathe("鲨鱼");
	}
}

class Animal2 {
	public void breathe(String animal) {
		if (animal.contains("鱼")) {
			System.out.println(String.format("%s在水里呼吸", animal));
		}
		else {
			System.out.println(String.format("%s呼吸空气", animal));
		}
	}
}
