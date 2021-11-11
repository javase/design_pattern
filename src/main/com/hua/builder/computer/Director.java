package com.hua.builder.computer;

/**
 * 主管 （Director） 类定义调用构造步骤的顺序， 这样你就可以创建和复用特定的产品配置。
 */
public class Director {

    public void makeComputer(ComputerBuilder builder){
        builder.setUsbCount();
        builder.setDisplay();
        builder.setKeyboard();
    }

}