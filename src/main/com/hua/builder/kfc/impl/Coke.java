package com.hua.builder.kfc.impl;

import com.hua.builder.kfc.ColdDrink;

/**
 * Created by lerry on 2017/9/26.
 * @author lerry
 */
public class Coke extends ColdDrink {
	@Override
	public String name() {
		return "可口可乐";
	}

	@Override
	public float price() {
		return 30.0f;
	}
}
