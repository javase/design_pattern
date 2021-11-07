package com.hua.chain.servlet.v1;

import java.util.ArrayList;

class FilterChain implements Filter {
	List<Filter> filters = new ArrayList<>();

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