package com.hua.factory.abstractf;

/**
 * Created by lerry on 2017/7/18.
 * 抽象工厂
 *
 * @author lerry
 */
public abstract class AbstractFactory {
    abstract Shape getShape(String shapeType);

    abstract Color getColor(String color);
}
