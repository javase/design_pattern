package com.hua.iterator.v7;

/**
 * 迭代器 （Iterator） 接口声明了遍历集合所需的操作：
 * 获取下一个元素、 获取当前位置和重新开始迭代等。
 * created at 2021-11-08 17:40
 * @author lerry
 */
public interface Iterator_<E> {
	boolean hasNext();

	E next();
}
