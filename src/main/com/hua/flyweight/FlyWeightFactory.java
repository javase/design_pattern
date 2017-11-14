package com.hua.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by limenghua on 2017/11/14.
 * @author limenghua
 */
public class FlyWeightFactory {
	static Map<String, Shape> shapes = new HashMap<>();

	public static Shape getShape(String key) {
		Shape shape = shapes.get(key);
		//如果shape==null,表示不存在,则新建,并且保持到共享池中
		if (shape == null) {
			// key为颜色
			shape = new Circle(key);
			shapes.put(key, shape);
		}
		return shape;
	}

	public static int getNum() {
		return shapes.size();
	}
}

class ClientApplication {
	public static void main(String[] args) {
		Shape shapeRed = FlyWeightFactory.getShape("红色");
		shapeRed.draw();
		Shape shapeGreen = FlyWeightFactory.getShape("绿色");
		shapeGreen.draw();
		// 如果共享池中有的话，就不用重新创建该颜色了
		Shape shapeRed2 = FlyWeightFactory.getShape("红色");
		shapeRed2.draw();
		Shape shapePurple = FlyWeightFactory.getShape("紫色");
		shapePurple.draw();
		Shape shapeBlue = FlyWeightFactory.getShape("蓝色");
		shapeBlue.draw();
		Shape shapeCyan = FlyWeightFactory.getShape("青色");
		shapeCyan.draw();
		Shape shapeCroci = FlyWeightFactory.getShape("橘色");
		shapeCroci.draw();
		System.out.println(String.format("共绘制了%d种颜色的圆形", FlyWeightFactory.getNum()));
	}
}

class StringTest {
	/**
	 * 字符串常量池是Java节约资源的一种方式。其实就是使用了享元模式的思想
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "he" + "llo";
		if (s1 == s2) {
			System.out.println("两个字符串是一个对象");
		}
	}
}

class IntegerTest {
	/**
	 * -128 to 127 会缓存下来，不在这个范围的数值，会新创建一个Integer
	 * @param args
	 */
	public static void main(String[] args) {
		Integer a = 1;
		Integer b = 1;
		if (a == b) {
			System.out.println("1两个整形变量是一个对象");
		}

		Integer a1 = 127;
		Integer b1 = 127;
		if (a1 == b1) {
			System.out.println("2两个整形变量是一个对象");
		}

		Integer a2 = 128;
		Integer b2 = 128;
		if (a2 == b2) {
			System.out.println("3两个整形变量是一个对象");
		}
	}
}
