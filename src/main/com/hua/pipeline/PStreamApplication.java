package com.hua.pipeline;

/**
 * Created by lerry on 2016/10/22.
 * 计算： （B+C）*B/2 的结果
 * @author lerry
 */
public class PStreamApplication {
	public static void main(String[] args) {
		new Thread(new Plus()).start();
		new Thread(new Multiply()).start();
		new Thread(new Div()).start();

		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 10; j++) {
				Msg msg = new Msg();
				msg.i = i;
				msg.j = j;
				msg.orgStr = "((" + i + "+" + j + ")*" + i + ")/2";
				Plus.bq.add(msg);
			}// end for
		}// end for
	}
}

