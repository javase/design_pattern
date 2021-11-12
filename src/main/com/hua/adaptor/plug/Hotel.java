package com.hua.adaptor.plug;

/**
 * 服务 （Service） 中有一些功能类 （通常来自第三方或遗留系统）。
 * 客户端与其接口不兼容， 因此无法直接调用其功能。
 * 德国旅馆，提供的是德标的充电插座
 * Created by lerry on 2017/9/27.
 * @author lerry
 */
public class Hotel {

	private DBSocketInterface dbSocketInterface;

	public Hotel() {
	}

	public Hotel(DBSocketInterface dbSocketInterface) {
		this.dbSocketInterface = dbSocketInterface;
	}

	public void charge() {
		dbSocketInterface.powerWithTwoRound();
	}

	public void setDbSocketInterface(DBSocketInterface dbSocketInterface) {
		this.dbSocketInterface = dbSocketInterface;
	}
}
