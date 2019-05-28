package com.hua.decorator.impl;

import com.hua.decorator.Shape;

/**
 * Created by lerry on 2017/9/28.
 * @author lerry
 */
public class Circle implements Shape {
	@Override
	public void draw() {
		System.out.println("Shape: Circle");
	}
}
