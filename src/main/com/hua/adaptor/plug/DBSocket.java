package com.hua.adaptor.plug;

/**
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
