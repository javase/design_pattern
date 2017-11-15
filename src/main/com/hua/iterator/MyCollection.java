package com.hua.iterator;

/**
 * Created by limenghua on 2017/11/14.
 * @author limenghua
 */
public class MyCollection implements Collection {

	public String[] strArray = {"A", "B", "C", "D", "E"};

	@Override
	public Iterator iterator() {
		return new MyIterator(this);
	}

	@Override
	public Object get(int i) {
		return strArray[i];
	}

	@Override
	public int size() {
		return strArray.length;
	}
}
