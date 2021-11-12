package com.hua.adaptor.plug;

/**
 * 国标插座
 * Created by lerry on 2017/9/27.
 * @author lerry
 */
public class GBSocket implements GBSocketInterface {
	@Override
	public void powerWithThreeFlat() {
		System.out.println("三项扁头国标插座供电");
	}
}
