package com.hua.builder.computer;

/**
 * 生成器 （Builder） 接口声明在所有类型生成器中通用的产品构造步骤。
 */
public abstract class ComputerBuilder {
    public abstract void setUsbCount();
    public abstract void setKeyboard();
    public abstract void setDisplay();

    public abstract Computer getComputer();
}