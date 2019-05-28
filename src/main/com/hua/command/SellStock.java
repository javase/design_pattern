package com.hua.command;

/**
 * Created by lerry on 2017/7/18.
 *
 * @author lerry
 */
public class SellStock implements Order {
    private Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
