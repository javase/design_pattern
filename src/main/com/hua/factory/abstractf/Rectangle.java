package com.hua.factory.abstractf;

/**
 * Created by lerry on 2017/7/18.
 *
 * @author lerry
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
