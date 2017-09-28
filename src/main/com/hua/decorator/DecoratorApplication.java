package com.hua.decorator;

import com.hua.decorator.impl.BlueShapeDecorator;
import com.hua.decorator.impl.Circle;
import com.hua.decorator.impl.Rectangle;
import com.hua.decorator.impl.RedShapeDecorator;

/**
 * 装饰器模式
 * Created by limenghua on 2017/9/28.
 * @author limenghua
 */
public class DecoratorApplication {
	public static void main(String[] args) {
		Shape circle = new Circle();
		System.out.println("No use decorator : ");
		circle.draw();

		System.out.println("----------------------------------");
		Shape redCircle = new RedShapeDecorator(circle);
		System.out.println("use red decorator:");
		redCircle.draw();

		System.out.println("----------------------------------");
		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		System.out.println("use red docorator:");
		redRectangle.draw();

		// 用两个装饰器对矩形进行装饰
		System.out.println("----------------------------------");
		System.out.println("use tow colors decorator");
		Shape redBlueRectangle = new RedShapeDecorator(new BlueShapeDecorator(new Rectangle()));
		redBlueRectangle.draw();

	}
}
