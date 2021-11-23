package com.hua.proxy.staticproxy;

import java.util.Random;

/**
 * 服务 （Service） 类提供了一些实用的业务逻辑。
 */
public class Tank implements Movable {

    /**
     * 模拟坦克移动了一段儿时间
     */
    @Override
    public void move() {
        System.out.println("Tank moving claclacla...");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}