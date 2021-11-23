package com.hua.state.mm;

/**
 * 具体状态 （Concrete States） 会自行实现特定于状态的方法。
 * 为了避免多个状态中包含相似代码， 你可以提供一个封装有部分通用行为的中间抽象类。
 */
public class MMNervousState extends MMState {
    @Override
    void smile() {
        System.out.println("nervous smile");
    }

    @Override
    void cry() {
        System.out.println("nervous cry");
    }

    @Override
    void say() {
        System.out.println("nervous say");
    }
}
