package com.hua.builder.kfc.impl;

import com.hua.builder.kfc.Burger;

/**
 * Created by lerry on 2017/9/26.
 * @author lerry
 */
public class VegBurger extends Burger {
	@Override
	public String name() {
		return "素食汉堡";
	}

	@Override
	public float price() {
		return 25.0f;
	}
}
