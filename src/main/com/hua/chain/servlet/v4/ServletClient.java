package com.hua.chain.servlet.v4;

/**
 * created at 2021-11-07 14:45
 * @author lerry
 */
public class ServletClient {
	public static void main(String[] args) {
		Request request = new Request();
		request.str = "大家好:)，<script>，欢迎访问 mashibing.com ，大家都是996 ";
		Response response = new Response();
		response.str = "";

		FilterChain filterChain = new FilterChain();
		filterChain.add(new HTMLFilter()).add(new SensitiveFilter());
		filterChain.doFilter(request, response);
		System.out.printf("Request:%s\n", request.str);
		System.out.printf("Response:%s\n", response.str);
	}
}
