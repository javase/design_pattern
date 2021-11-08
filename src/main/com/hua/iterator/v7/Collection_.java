package com.hua.iterator.v7;

/**
 * 集合 （Collection） 接口声明一个或多个方法来获取与集合兼容的迭代器。
 * 请注意， 返回方法的类型必须被声明为迭代器接口， 因此具体集合可以返回各种不同种类的迭代器。
 * @param <E>
 */
public interface Collection_<E> {
	void add(E o);

	int size();

	Iterator_ iterator();
}