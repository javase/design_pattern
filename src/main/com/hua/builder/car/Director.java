package com.hua.builder.car;

/**
 * 一般是一个较为复杂的对象，也就是说创建对象的过程比较复杂，一般会有比较多的代码量。
 * 在本例子中，产品类是一个具体的类，而非抽象类。
 * 实际编程中，产品类可以是由一个抽象类与它的不同实现组成，也可以是由多个抽象类与他们的实现组成。
 * Created by limenghua on 2017/9/26.
 * @author limenghua
 */
class Product {
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

/**
 * 引入抽象建造者的目的，是为了将建造的具体过程交与它的子类来实现。
 * 这样更容易扩展。
 * 一般至少会有两个抽象方法，一个用来建造产品，一个是用来返回产品。
 */
abstract class Builder {
	public abstract void setPart(String name, String type);

	public abstract Product getProduct();
}

/**
 * 实现抽象类的所有未实现的方法，具体来说一般是两项任务：组建产品；返回组建好的产品。
 */
class ConcreteBuilder extends Builder {

	private Product product = new Product();

	@Override
	public void setPart(String name, String type) {
		product.setName(name);
		product.setType(type);
	}

	@Override
	public Product getProduct() {
		return product;
	}
}

/**
 * 负责调用适当的建造者来组建产品，导演类一般不与产品类发生依赖关系，
 * 与导演类直接交互的是建造者类。
 * 一般来说，导演类被用来封装程序中易变的部分。
 * 自己理解： 导演和具体产品不直接交互，通过具体的建造者和产品交互
 */
public class Director {

	private Builder builder = new ConcreteBuilder();

	public Product getAProduct() {
		builder.setPart("宝马汽车", "X6");
		return builder.getProduct();
	}

	public Product getBProduct() {
		builder.setPart("奥迪汽车", "Q5");
		return builder.getProduct();
	}
}
