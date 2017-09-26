package com.hua.builder.kfc.impl;

import com.hua.builder.kfc.Burger;

/**
 * Created by limenghua on 2017/9/26.
 * @author limenghua
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
