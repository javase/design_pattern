package com.hua.chain.servlet.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * 把这些Handler组合起来，变成一个链，并通过一个统一入口处理
 */
public class FilterChain implements Filter {
	private List<Filter> filters = new ArrayList<>();

	public FilterChain add(Filter f) {
		filters.add(f);
		return this;
	}

	@Override
	public boolean doFilter(Request request, Response response) {
		for (Filter f : filters) {
			f.doFilter(request, response);
		}
		return true;
	}
}