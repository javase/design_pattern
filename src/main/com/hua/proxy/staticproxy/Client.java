package com.hua.proxy.staticproxy;

/**
 * created at 2021-11-23 17:44
 * @author lerry
 */
public class Client {
	public static void main(String[] args) {

		Tank t = new Tank();
		TankTimeProxy ttp = new TankTimeProxy(t);
		TankLogProxy tlp = new TankLogProxy(ttp);
		tlp.move();

	}
}
