package com.hua.pipeline;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created by lerry on 2016/10/22.
 * 计算加法
 *
 * @author lerry
 */
public class Plus implements Runnable {

    public static BlockingQueue<Msg> bq = new LinkedBlockingDeque<Msg>();
    public void run() {
        while (true) {
            try {
                Msg msg = bq.take();
                msg.j = msg.i + msg.j;
                Multiply.bq.add(msg);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }// end method
}
