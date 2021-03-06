package com.hua.factory.abstractf;

/**
 * Created by lerry on 2017/7/18.<br/>
 * 抽象工厂模式<br/>
 * 抽象工厂模式（Abstract Factory Pattern）是围绕一个超级工厂创建其他工厂。
 * 该超级工厂又称为其他工厂的工厂。
 * 这种类型的设计模式属于创建型模式
 *
 * @author lerry
 */
public class AbstractFactoryDemoApplication {
    public static void main(String[] args) {

        // 获取图形工厂
        AbstractFactory shapeF = FactoryPorducer.getFactory("SHAPE");
        //获取形状为 Circle 的对象
        Shape shape1 = shapeF.getShape("CIRCLE");

        //调用 Circle 的 draw 方法
        shape1.draw();

        //获取形状为 Rectangle 的对象
        Shape shape2 = shapeF.getShape("RECTANGLE");

        //调用 Rectangle 的 draw 方法
        shape2.draw();

        //获取形状为 Square 的对象
        Shape shape3 = shapeF.getShape("SQUARE");
        shape3.draw();

        AbstractFactory colorFactory = FactoryPorducer.getFactory("COLOR");
        //获取颜色为 Red 的对象
        Color color1 = colorFactory.getColor("RED");

        //调用 Red 的 fill 方法
        color1.fill();

        //获取颜色为 Green 的对象
        Color color2 = colorFactory.getColor("Green");

        //调用 Green 的 fill 方法
        color2.fill();

        //获取颜色为 Blue 的对象
        Color color3 = colorFactory.getColor("BLUE");

        //调用 Blue 的 fill 方法
        color3.fill();
    }
}
