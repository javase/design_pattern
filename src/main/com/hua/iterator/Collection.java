package com.hua.iterator;

/**
 * Created by limenghua on 2017/11/14.
 * @author limenghua
 */
public interface Collection {
	Iterator iterator();

	Object get(int i);

	int size();
}
