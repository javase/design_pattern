package com.hua.flyweight;

/**
 * Created by limenghua on 2017/11/14.
 * @author limenghua
 */
public class Circle extends Shape {

	// 随着环境的改变而改变，不能够共享的状态就是外部状态。
	private String color;

	public Circle(String color) {
		this.color = color;
	}

	@Override
	void draw() {
		System.out.println("画了一个" + color + "的圆形");
	}
}
