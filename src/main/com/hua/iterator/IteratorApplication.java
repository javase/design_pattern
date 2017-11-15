package com.hua.iterator;

/**
 * Created by limenghua on 2017/11/14.
 * @author limenghua
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
