package com.hua.builder.kfc;

/**
 * 汉堡包抽象类，实现了餐饮条目接口
 * Created by lerry on 2017/9/26.
 * @author lerry
 */
public abstract class Burger implements Item {

	/**
	 * 汉堡包使用纸盒包装
	 * @return
	 */
	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();
}
