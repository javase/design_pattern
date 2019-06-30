package com.hua.pipeline;



import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created by lerry on 2016/10/22.
 *
 * @author lerry
 */
public class Div implements Runnable {

    public static BlockingQueue<Msg> bq = new LinkedBlockingDeque<Msg>();

    @Override
    public void run() {
        while (true) {
            try {
                Msg msg = bq.take();
                msg.i = msg.i / 2;
                // "计算结果" + msg.orgStr + "=" + msg.i
                System.out.println(String.format("计算结果：%s=%s", msg.orgStr, msg.i));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

