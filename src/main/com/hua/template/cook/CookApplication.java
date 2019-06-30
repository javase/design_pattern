package com.hua.template.cook;

import static com.hua.util.Print.*;

/**
 * <pre>
 * 模板方法模式
 * 炒菜，不同的子类实现，将会执行不同的代码
 * </pre>
 * Created by lerry on 2017/11/14.
 * @author lerry
 */
public class CookApplication {
	public static void main(String[] args) {
		AbstractCookClass cabbage = new CabbageCook();
		cabbage.cookProcess();

		print("--------------------------------");
		cabbage = new ChineseCabbageCook();
		cabbage.cookProcess();
	}
}
