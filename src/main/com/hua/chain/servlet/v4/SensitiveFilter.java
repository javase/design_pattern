package com.hua.chain.servlet.v4;

/**
 * 具体处理者 （Concrete Handlers） 包含处理请求的实际代码。 每个处理者接收到请求后， 都必须决定是否进行处理， 以及是否沿着链传递请求。
 * 敏感词过滤
 */
class SensitiveFilter implements Filter {
	@Override
	public void doFilter(Request request, Response response, FilterChain filterChain) {
		request.str = request.str.replaceAll("996", "955");
		System.out.println("敏感词替换");
		filterChain.doFilter(request, response);
		response.str += "--after SensitiveFilter.doFilter()";
	}
}