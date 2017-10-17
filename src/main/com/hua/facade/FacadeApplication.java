package com.hua.facade;

/**
 * 外观模式（门面模式）
 * 自己理解： 去看病时，由一个接待员去处理挂号、拿药、化验、收费等，接待员就相当于一个外观类
 * Created by limenghua on 2017/10/17.
 * @author limenghua
 */
public class FacadeApplication {

	public static void main(String[] args) {
		ShapeMaker maker = new ShapeMaker();
		maker.drawRectangle();
		maker.drawSquare();
		maker.drawCircle();
	}
}
