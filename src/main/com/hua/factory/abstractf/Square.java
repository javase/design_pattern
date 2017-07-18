package com.hua.factory.abstractf;

/**
 * Created by limenghua on 2017/7/18.
 *
 * @author limenghua
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
