package com.hua.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lerry on 2017/7/18.<p/>
 * 命令调用类,想要调用命令,必然持有命令对象
 * 发送者 （Sender）——亦称 “触发者 （Invoker）”——类负责对请求进行初始化，
 * 其中必须包含一个成员变量来存储对于命令对象的引用。
 * 发送者触发命令， 而不向接收者直接发送请求。
 * 注意， 发送者并不负责创建命令对象： 它通常会通过构造函数从客户端处获得预先生成的命令。
 * @author lerry
 */
public class Broker {

    private List<Order> orderList = new ArrayList<>();

    /**
     * 发送者并不负责创建命令对象： 它通常会通过构造函数从客户端处获得预先生成的命令。
     * @param order
     */
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
