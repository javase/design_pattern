package com.hua.decorator.impl;

import com.hua.decorator.Shape;
import com.hua.decorator.ShapeDecorator;

/**
 * Created by limenghua on 2017/9/28.
 * @author limenghua
 */
public class RedShapeDecorator extends ShapeDecorator {
	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}

	@Override
	public void draw() {
		decoratedShape.draw();
		setRedBorder();
	}

	private void setRedBorder() {
		System.out.println("Red border");
	}
}
