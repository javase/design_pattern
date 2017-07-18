package com.hua.command;

/**
 * Created by limenghua on 2017/7/18.
 * 请求类
 *
 * @author limenghua
 */
public class Stock {
    private String name = "apple";
    private int quantity = 5;

    public void buy() {
        quantity++;
        System.out.println(String.format("Stock[name:%s,quantity:%d]bought", name, quantity));
    }

    public void sell() {
        quantity--;
        System.out.println(String.format("Stock[name:%s,quantity:%d]sold", name, quantity));
    }
}
