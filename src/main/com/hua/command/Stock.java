package com.hua.command;

/**
 * Created by lerry on 2017/7/18.
 * 请求类<p/>
 * 命令接收者,用于实际执行命令
 * 接收者 （Receiver） 类包含部分业务逻辑。
 * 几乎任何对象都可以作为接收者。
 * 绝大部分命令只处理如何将请求传递到接收者的细节， 接收者自己会完成实际的工作。
 * @author lerry
 */
public class Stock {
    private String name = "apple";
    private int quantity = 5;

    public void buy() {
        quantity++;
        System.out.println(String.format("Stock[name:%s,quantity:%d]bought", name, quantity));
    }

    public void sell() {
        quantity--;
        System.out.println(String.format("Stock[name:%s,quantity:%d]sold", name, quantity));
    }
}
