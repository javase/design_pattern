package com.hua.adaptor.plug;

/**
 * 服务 （Service） 中有一些功能类 （通常来自第三方或遗留系统）。
 * 客户端与其接口不兼容， 因此无法直接调用其功能。
 * 德标插座
 * Created by lerry on 2017/9/27.
 * @author lerry
 */
public class DBSocket implements DBSocketInterface {
	@Override
	public void powerWithTwoRound() {
		System.out.println("两项圆头的德标插座供电");
	}
}
