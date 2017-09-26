package com.hua.builder.kfc;

/**
 * 冷饮抽象类，实现了餐饮条目接口
 * Created by limenghua on 2017/9/26.
 * @author limenghua
 */
public abstract class ColdDrink implements Item {

	/**
	 * 冷饮使用瓶装
	 * @return
	 */
	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();
}
