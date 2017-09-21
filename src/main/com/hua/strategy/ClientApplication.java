package com.hua.strategy;

/**
 * Created by limenghua on 2017/3/20.
 * 策略模式
 * 可以这样描述这一系列策略算法：策略算法是相同行为的不同实现
 */
public class ClientApplication {
    public static void main(String[] args) {
        // 选择并创建需要使用的策略对象
        MemberStrategy strategy = new AdvancedMemberStrategy();

        // 创建环境
        Price price = new Price(strategy);

        // 计算价格
        double quote = price.quote(300);
        System.out.println("图书的最终价格为：" + quote);
    }
}
