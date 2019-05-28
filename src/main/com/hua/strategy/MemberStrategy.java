package com.hua.strategy;

/**
 * Created by lerry on 2017/3/20.
 */
public interface MemberStrategy {

    /**
     * 计算图书的价格
     *
     * @param booksPrice 图书原价
     * @return 打折后的价格
     */
    double calcPrice(double booksPrice);
}
