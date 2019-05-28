package com.hua.iterator;

/**
 * Created by lerry on 2017/11/14.
 * @author lerry
 */
public class MyIterator implements Iterator {

	private Collection collection;

	private int position = -1;


	public MyIterator(Collection collection) {
		this.collection = collection;
	}

	@Override
	public Object previous() {
		if (position > 0) {
			position--;
		}
		return collection.get(position);
	}

	@Override
	public Object next() {
		if (position < collection.size() - 1) {
			position++;
		}
		return collection.get(position);
	}

	@Override
	public Boolean hasNext() {
		if (position < collection.size() - 1) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public Object first() {
		position = 0;
		return collection.get(position);
	}
}
