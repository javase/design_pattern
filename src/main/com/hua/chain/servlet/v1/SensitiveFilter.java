package com.hua.chain.servlet.v1;

/**
 * 具体处理者 （Concrete Handlers） 包含处理请求的实际代码。 每个处理者接收到请求后， 都必须决定是否进行处理， 以及是否沿着链传递请求。
 * 敏感词过滤
 */
class SensitiveFilter implements Filter {
	@Override
	public boolean doFilter(Request request, Response response) {
		request.str = request.str.replaceAll("996", "955");
		return true;
	}
}