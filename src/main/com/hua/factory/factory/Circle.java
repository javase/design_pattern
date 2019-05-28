package com.hua.factory.factory;

/**
 * Created by lerry on 2017/7/18.
 *
 * @author lerry
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
