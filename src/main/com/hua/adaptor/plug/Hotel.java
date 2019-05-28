package com.hua.adaptor.plug;

/**
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
