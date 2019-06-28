package com.hua.iterator;

/**
 * 迭代器模式
 * Created by lerry on 2017/11/14.
 * @author lerry
 */
public class IteratorApplication {
	public static void main(String[] args) {
		Collection collection = new MyCollection();
		Iterator iterator = collection.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
