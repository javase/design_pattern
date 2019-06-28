package com.hua.builder.car;

public class BuilderApplication {
	public static void main(String[] args) {
		Director director = new Director();
		Product product1 = director.getAProduct();
		product1.showProduct();

		Product product2 = director.getBProduct();
		product2.showProduct();
	}
}