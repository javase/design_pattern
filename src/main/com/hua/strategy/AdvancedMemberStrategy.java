package com.hua.strategy;

/**
 * Created by lerry on 2017/3/20.
 */
public class AdvancedMemberStrategy implements MemberStrategy {

    public double calcPrice(double booksPrice) {
        System.out.println("对于高级会员的折扣为20%");
        return booksPrice * 0.8;
    }
}
