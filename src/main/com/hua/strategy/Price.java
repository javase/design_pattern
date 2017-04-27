package com.hua.strategy;

/**
 * Created by limenghua on 2017/3/20.
 */
public class Price {
    private MemberStrategy strategy;

    public Price(MemberStrategy strategy) {
        this.strategy = strategy;
    }

    public double quote(double booksPrice) {
        return this.strategy.calcPrice(booksPrice);
    }
}
