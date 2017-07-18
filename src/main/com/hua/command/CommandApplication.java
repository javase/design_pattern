package com.hua.command;

/**
 * Created by limenghua on 2017/7/18.<br/>
 * 命令模式<br/>
 * 我们首先创建作为命令的接口 Order，然后创建作为请求的 Stock 类。实体命令类 BuyStock 和 SellStock，实现了 Order 接口，将执行实际的命令处理。创建作为调用对象的类 Broker，它接受订单并能下订单。
 * Broker 对象使用命令模式，基于命令的类型确定哪个对象执行哪个命令。<br/>
 * 命令模式（Command Pattern）是一种数据驱动的设计模式，它属于行为型模式。<br/>
 * 请求以命令的形式包裹在对象中，并传给调用对象。调用对象寻找可以处理该命令的合适的对象，并把该命令传给相应的对象，<br/>
 * 该对象执行命令。<br/>
 *
 * @author limenghua
 */
public class CommandApplication {

    public static void main(String[] args) {
        Stock stock = new Stock();

        BuyStock buyStock = new BuyStock(stock);
        SellStock sellStock = new SellStock(stock);

        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);

        broker.placeOrders();
    }
}
