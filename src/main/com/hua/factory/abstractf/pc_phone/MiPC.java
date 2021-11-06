package com.hua.factory.abstractf.pc_phone;

/**
 * 定义小米电脑产品(MIPC)
 */
public class MiPC implements PC {
	public MiPC() {
		this.make();
	}

	@Override
	public void make() {
		System.out.println("make xiaomi PC!");
	}
}
