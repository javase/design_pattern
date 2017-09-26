package com.hua.builder.kfc;

/**
 * 餐饮条目接口
 * Created by limenghua on 2017/9/26.
 * @author limenghua
 */
public interface Item {
	String name();

	Packing packing();

	float price();
}
