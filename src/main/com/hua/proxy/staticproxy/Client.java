package com.hua.proxy.staticproxy;

/**
 * 客户端 （Client） 能通过同一接口与服务或代理进行交互，
 * 所以你可在一切需要服务对象的代码中使用代理。
 * created at 2021-11-23 17:44
 * @author lerry
 */
public class Client {
	public static void main(String[] args) {

		Tank tank = new Tank();
		TankTimeProxy ttp = new TankTimeProxy(tank);
		TankLogProxy tlp = new TankLogProxy(ttp);
		tlp.move();

	}
}
