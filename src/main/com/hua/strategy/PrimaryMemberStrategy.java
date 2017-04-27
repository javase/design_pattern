package com.hua.strategy;

/**
 * Created by limenghua on 2017/3/20.
 */
public class PrimaryMemberStrategy implements MemberStrategy {

    public double calcPrice(double booksPrice) {
        System.out.println("初级会员没有折扣");
        return booksPrice;
    }
}
