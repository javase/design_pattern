package com.hua.command;


/**
 * Created by limenghua on 2017/7/18.
 *
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
