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
