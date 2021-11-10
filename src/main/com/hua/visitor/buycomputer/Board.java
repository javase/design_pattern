package com.hua.visitor.buycomputer;

/**
 * 具体元素 （Concrete Element） 必须实现接收方法。
 * 该方法的目的是根据当前元素类将其调用重定向到相应访问者的方法。
 * 请注意， 即使元素基类实现了该方法， 所有子类都必须对其进行重写并调用访问者对象中的合适方法。
 * 电脑部件：主板
 */
class Board extends ComputerPart {

    @Override
    void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    double getPrice() {
        return 200;
    }
}