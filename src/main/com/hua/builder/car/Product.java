package com.hua.builder.car;

/**
 * 一般是一个较为复杂的对象，也就是说创建对象的过程比较复杂，一般会有比较多的代码量。
 * 在本例子中，产品类是一个具体的类，而非抽象类。
 * 实际编程中，产品类可以是由一个抽象类与它的不同实现组成，也可以是由多个抽象类与他们的实现组成。
 * Created by lerry on 2017/9/26.
 * @author lerry
 */
public class Product {
	private String name;

	private String type;

	public void showProduct() {
		System.out.println(String.format("name:%s,type:%s", name, type));
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setType(String type) {
		this.type = type;
	}
}