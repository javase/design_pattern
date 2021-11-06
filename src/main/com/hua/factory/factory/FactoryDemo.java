package com.hua.factory.factory;

public class FactoryDemo {
	public static void main(String[] arg) {
		AbstractFactory miFactory = new XiaoMiFactory();
		AbstractFactory appleFactory = new AppleFactory();
		miFactory.makePhone();            // make xiaomi phone!
		appleFactory.makePhone();        // make iphone!
	}
}
