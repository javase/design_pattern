package com.hua.chain.servlet.v4;

import java.util.ArrayList;
import java.util.List;

/**
 * 把这些Handler组合起来，变成一个链，并通过一个统一入口处理
 * created at 2021-11-07 14:39
 * @author lerry
 */
public class FilterChain {
	private List<Filter> filterList = new ArrayList<>();

	private int index = 0;

	public FilterChain add(Filter filter) {
		filterList.add(filter);
		return this;
	}


	public void doFilter(Request request, Response response) {
		if (index == filterList.size()) {
			return;
		}
		Filter filter = filterList.get(index);
		index++;
		filter.doFilter(request, response, this);
	}
}
