package com.hua.command;


/**
 * Created by limenghua on 2017/7/18.
 * 具体命令,持有实际执行命令的命令接收者(Stock)
 * @author limenghua
 */
public class BuyStock implements Order{

    private Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
