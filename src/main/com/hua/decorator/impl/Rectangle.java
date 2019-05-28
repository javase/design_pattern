package com.hua.decorator.impl;

import com.hua.decorator.Shape;

/**
 * Created by lerry on 2017/9/28.
 * @author lerry
 */
public class Rectangle implements Shape {
	// 长方形
	@Override
	public void draw() {
		System.out.println("Shape:Rectangle");
	}
}
