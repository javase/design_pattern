package com.hua.builder.car;

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