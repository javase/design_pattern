package com.hua.decorator.impl;

import com.hua.decorator.Shape;
import com.hua.decorator.ShapeDecorator;

/**
 * Created by limenghua on 2017/9/28.
 * @author limenghua
 */
public class BlueShapeDecorator extends ShapeDecorator {
	public BlueShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}

	@Override
	public void draw() {
		decoratedShape.draw();
		setRedBorder();
	}

	private void setRedBorder() {
		System.out.println("Blue border");
	}
}
