package com.hua.adaptor.plug;

/**
 * 适配器模式
 * Created by lerry on 2017/9/27.
 * @author lerry
 */
public class AdaptorClient {

	public static void main(String[] args) {
		DBSocketInterface dbSocket = new DBSocket();
		Hotel hotel = new Hotel(dbSocket);
		hotel.charge();

		// 充电器是国标的
		GBSocketInterface gbSocketInterface = new GBSocket();
		// 适配器可以使用国标接口
		SocketAdaptor adaptor = new SocketAdaptor(gbSocketInterface);
		// 适配器插到旅馆的德标插座上
		hotel.setDbSocketInterface(adaptor);
		hotel.charge();

	}
}
