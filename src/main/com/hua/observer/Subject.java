package com.hua.observer;

/**
 * Created by limenghua on 2017/4/18.
 */
public interface Subject {

    /**
     * 注册观察者
     *
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 移除观察者
     *
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知所有的观察者
     */
    void notifyObservers();
}
