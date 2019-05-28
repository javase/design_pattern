package com.hua.builder.kfc.impl;

import com.hua.builder.kfc.Burger;

/**
 * Created by lerry on 2017/9/26.
 * @author lerry
 */
public class ChickenBurger extends Burger {
	@Override
	public String name() {
		return "鸡肉汉堡";
	}

	@Override
	public float price() {
		return 50.5f;
	}
}
