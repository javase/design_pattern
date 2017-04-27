package com.hua.strategy;

/**
 * Created by limenghua on 2017/3/20.
 */
public class IntermediaMemberStrategy implements MemberStrategy {

    public double calcPrice(double booksPrice) {
        System.out.println("对于中级会员的折扣为10%");
        return booksPrice * 0.9;
    }
}
