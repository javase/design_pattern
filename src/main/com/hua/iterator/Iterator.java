package com.hua.iterator;

/**
 * Created by lerry on 2017/11/14.
 * @author lerry
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
