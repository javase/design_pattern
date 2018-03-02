package com.hua.principle.single;

/**
 * 可以看到，这种修改方式没有改动原来的方法，而是在类中新加了一个方法，
 * 这样虽然也违背了单一职责原则，但在方法级别上却是符合单一职责原则的，
 * 因为它并没有动原来方法的代码。这三种方式各有优缺点，那么在实际编程中，
 * 采用哪一中呢？其实这真的比较难说，需要根据实际情况来确定。我的原则是：
 * 只有逻辑足够简单，才可以在代码级别上违反单一职责原则；只有类中方法数量足够少，
 * 才可以在方法级别上违反单一职责原则
 * Created by limenghua on 2018/3/2.
 * @author limenghua
 */
public class AnimalSingleApplication {
	public static void main(String[] args) {
		Animal3 animal = new Animal3();
		animal.breathe("牛");
		animal.breathe("羊");
		animal.breathe("鸡");
		animal.breathe2("鲨鱼");
	}
}

class Animal3 {
	public void breathe(String animal) {
		System.out.println(String.format("%s呼吸空气", animal));
	}

	public void breathe2(String animal) {
		System.out.println(String.format("%s在水里呼吸", animal));
	}
}
