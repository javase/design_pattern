package com.hua.chain.servlet.v1;

/**
 * 处理者 （Handler） 声明了所有具体处理者的通用接口。 该接口通常仅包含单个方法用于请求处理， 但有时其还会包含一个设置链上下个处理者的方法。
 */
interface Filter {
	boolean doFilter(Request request, Response response);
}