package com.hua.factory.abstractf;

/**
 * Created by limenghua on 2017/7/18.
 *
 * @author limenghua
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
