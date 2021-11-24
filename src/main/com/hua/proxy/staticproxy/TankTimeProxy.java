package com.hua.proxy.staticproxy;

/**
 * 代理 （Proxy） 类包含一个指向服务对象的引用成员变量。
 * 代理完成其任务 （例如延迟初始化、 记录日志、 访问控制和缓存等） 后会将请求传递给服务对象。
 * 通常情况下， 代理会对其服务对象的整个生命周期进行管理。
 */
class TankTimeProxy implements Movable {
	Movable realMovable;

	public TankTimeProxy(Movable realMovable) {
		this.realMovable = realMovable;
	}

	@Override
	public void move() {
		long start = System.currentTimeMillis();
		realMovable.move();
		long end = System.currentTimeMillis();
		System.out.println("time>>" + (end - start));
	}
}