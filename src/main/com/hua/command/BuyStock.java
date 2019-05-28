package com.hua.command;


/**
 * Created by lerry on 2017/7/18.
 * 具体命令,持有实际执行命令的命令接收者(Stock)
 * @author lerry
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
