package com.hua.facade;

/**
 * Created by limenghua on 2017/10/17.
 * @author limenghua
 */
public class ShapeMaker {
	private Rectangle rectangle;

	private Square square;

	private Circle circle;

	public ShapeMaker() {
		rectangle = new Rectangle();
		square = new Square();
		circle = new Circle();
	}

	public void drawRectangle() {
		rectangle.draw();
	}

	public void drawSquare() {
		square.draw();
	}

	public void drawCircle() {
		circle.draw();
	}
}
