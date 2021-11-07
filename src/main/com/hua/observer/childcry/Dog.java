package com.hua.observer.childcry;
/**
 * 具体订阅者(具体观察者) （Concrete Subscribers） 可以执行一些操作来回应发布者的通知。
 * 所有具体订阅者类都实现了同样的接口， 因此发布者不需要与具体类相耦合。
 */
class Dog implements Observer {
    public void wang() {
        System.out.println("dog wang...");
    }

    @Override
    public void actionOnWakeUp(Event event) {
        wang();
    }
}