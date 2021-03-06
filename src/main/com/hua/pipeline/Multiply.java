package com.hua.pipeline;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created by lerry on 2016/10/22.
 *
 * @author lerry
 */
public class Multiply implements Runnable {

    public static BlockingQueue<Msg> bq = new LinkedBlockingDeque<Msg>();

    @Override
	public void run() {
        while (true) {
            try {
                Msg msg = bq.take();
                msg.i = msg.i * msg.j;
                Div.bq.add(msg);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
