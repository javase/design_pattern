package com.hua.builder.kfc.impl;

import com.hua.builder.kfc.ColdDrink;

/**
 * Created by limenghua on 2017/9/26.
 * @author limenghua
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
