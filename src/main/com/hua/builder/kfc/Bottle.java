package com.hua.builder.kfc;

/**
 * 实现包装接口
 * Created by limenghua on 2017/9/26.
 * @author limenghua
 */
public class Bottle implements Packing {
	@Override
	public String pack() {
		return "瓶装";
	}
}
