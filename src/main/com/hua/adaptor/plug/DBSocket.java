package com.hua.adaptor.plug;

/**
 * 德标插座
 * Created by limenghua on 2017/9/27.
 * @author limenghua
 */
public class DBSocket implements DBSocketInterface {
	@Override
	public void powerWithTwoRound() {
		System.out.println("两项圆头的德标插座供电");
	}
}
