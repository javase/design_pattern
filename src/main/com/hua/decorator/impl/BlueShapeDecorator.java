package com.hua.decorator.impl;

import com.hua.decorator.Shape;
import com.hua.decorator.ShapeDecorator;

/**
 * Created by lerry on 2017/9/28.
 * @author lerry
 */
public class BlueShapeDecorator extends ShapeDecorator {
	public BlueShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}

	@Override
	public void draw() {
		decoratedShape.draw();
		setBlueBorder();
	}

	private void setBlueBorder() {
		System.out.println("Blue border");
	}
}
