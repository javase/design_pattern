package com.hua.composite.employee;

/**
 * Created by limenghua on 2017/11/9.
 * @author limenghua
 */
public class CompositeApplication {
	public static void main(String[] args) {
		Employee ceo = new Employee("刘备", "管理部", 50000);
		Employee gy = new Employee("关羽", "作战部", 20000);
		Employee zf = new Employee("张飞", "作战部", 20000);
		Employee zy = new Employee("赵云", "作战部", 20000);
		Employee hz = new Employee("黄忠", "作战部", 20000);
		Employee mc = new Employee("马超", "作战部", 20000);

		Employee zgl = new Employee("诸葛亮", "智囊团", 30000);
		Employee jw = new Employee("姜维", "智囊团徒弟", 30000);

		ceo.add(zgl);
		ceo.add(gy);

		zgl.add(jw);
		gy.add(zf);
		gy.add(zy);
		gy.add(hz);
		gy.add(mc);

		System.out.println(ceo);
		for (Employee one : ceo.getSubordinates()) {
			System.out.println(one);
			for (Employee two : one.getSubordinates()) {
				System.out.println(two);
			}
		}
	}
}
