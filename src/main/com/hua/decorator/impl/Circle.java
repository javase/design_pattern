package com.hua.decorator.impl;

import com.hua.decorator.Shape;

/**
 * Created by limenghua on 2017/9/28.
 * @author limenghua
 */
public class Circle implements Shape {
	@Override
	public void draw() {
		System.out.println("Shape: Circle");
	}
}
