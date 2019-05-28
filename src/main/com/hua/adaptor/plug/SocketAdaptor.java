package com.hua.adaptor.plug;

/**
 * 电源适配器，实现了德标接口，可以在旅馆中插入到德标的插座上，同时重写德标的充电方法，改用国标接口充电
 * Created by lerry on 2017/9/27.
 * @author lerry
 */
public class SocketAdaptor implements DBSocketInterface {

	/**
	 * 持有对新接口的引用
	 */
	private GBSocketInterface gbSocketInterface;

	public SocketAdaptor(GBSocketInterface gbSocketInterface) {
		this.gbSocketInterface = gbSocketInterface;
	}

	/**
	 * 对德标的调用适配到新接口
	 * 对适配器原有接口方法的调用被委托给新接口的实例的特定方法
	 * 关键代码！
	 */
	@Override
	public void powerWithTwoRound() {
		gbSocketInterface.powerWithThreeFlat();
	}
}
