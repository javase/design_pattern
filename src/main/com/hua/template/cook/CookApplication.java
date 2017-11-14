package com.hua.template.cook;

/**
 * 炒菜，不同的子类实现，将会执行不同的代码
 * Created by limenghua on 2017/11/14.
 * @author limenghua
 */
public class CookApplication {
	public static void main(String[] args) {
		CookAbstractClass cabbage = new CookCabbage();
		cabbage.cookProcess();

		System.out.println("--------------------------------");
		cabbage = new CookChineseCabbage();
		cabbage.cookProcess();
	}
}
