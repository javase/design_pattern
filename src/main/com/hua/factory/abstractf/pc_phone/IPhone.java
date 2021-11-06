package com.hua.factory.abstractf.pc_phone;

public class IPhone implements Phone {
    public IPhone() {
        this.make();
    }
    @Override
    public void make() {
        System.out.println("make iphone!");
    }
}
