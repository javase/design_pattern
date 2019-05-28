package com.hua.builder.kfc;

/**
 * 餐饮条目接口
 * Created by lerry on 2017/9/26.
 * @author lerry
 */
public interface Item {
	String name();

	Packing packing();

	float price();
}
