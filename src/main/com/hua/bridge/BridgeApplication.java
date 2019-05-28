package com.hua.bridge;

/**
 * Created by lerry on 2017/10/20.
 * @author lerry
 */
public class BridgeApplication {
	public static void main(String[] args) {
		AreaFrom from = new AreaTianJin();
		from.bridge = new AreaLosAngeles();
		from.fromAreaA();
		from.bridge.targetAreaB();
	}
}
