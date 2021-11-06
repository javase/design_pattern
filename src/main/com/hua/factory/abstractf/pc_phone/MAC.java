package com.hua.factory.abstractf.pc_phone;

/**
 * 定义苹果电脑产品(MAC)
 */
public class MAC implements PC {
	public MAC() {
		this.make();
	}

	@Override
	public void make() {
		System.out.println("make MAC!");
	}
}
