package com.hua.factory.abstractf.pc_phone;

public class AbstractFactoryDemo {
	public static void main(String[] arg) {
		AbstractFactory miFactory = new XiaoMiFactory();
		AbstractFactory appleFactory = new AppleFactory();
		miFactory.makePhone();            // make xiaomi phone!
		miFactory.makePC();                // make xiaomi PC!
		appleFactory.makePhone();        // make iphone!
		appleFactory.makePC();            // make MAC!
	}
}
