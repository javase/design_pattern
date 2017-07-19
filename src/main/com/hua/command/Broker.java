package com.hua.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by limenghua on 2017/7/18.<p/>
 * 命令调用类,想要调用命令,必然持有命令对象
 *
 * @author limenghua
 */
public class Broker {

    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    /**
     * 执行命令接口实现类的execute()方法
     */
    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
