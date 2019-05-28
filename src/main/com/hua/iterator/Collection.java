package com.hua.iterator;

/**
 * Created by lerry on 2017/11/14.
 * @author lerry
 */
public interface Collection {
	Iterator iterator();

	Object get(int i);

	int size();
}
