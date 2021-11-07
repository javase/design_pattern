package com.hua.chain.servlet.v1;

/**
 * 客户端 （Client） 可根据程序逻辑一次性或者动态地生成链。 值得注意的是， 请求可发送给链上的任意一个处理者， 而非必须是第一个处理者。
 */
public class ServletClient {
	public static void main(String[] args) {
		Request request = new Request();
		request.str = "大家好:)，<script>，欢迎访问 mashibing.com ，大家都是996 ";
		Response response = new Response();
		response.str = "";

		FilterChain chain = new FilterChain();
		chain.add(new HTMLFilter()).add(new SensitiveFilter());
		chain.doFilter(request, response);
		System.out.println(request.str);

		System.out.println("------");
		Filter oneF = new SensitiveFilter();
		request.str = "大家好:)，<script>，欢迎访问 mashibing.com ，大家都是996 ";
		oneF.doFilter(request, response);
		System.out.println(request.str);
	}
}


class Request {
	String str;
}

class Response {
	String str;
}




