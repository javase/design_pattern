package com.hua.iterator;

/**
 * Created by limenghua on 2017/11/14.
 * @author limenghua
 */
public interface Iterator {

	// 前移
	Object previous();

	// 后移
	Object next();

	Boolean hasNext();

	// 获取第一个元素
	Object first();
}
