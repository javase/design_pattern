package com.hua.builder.car;

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