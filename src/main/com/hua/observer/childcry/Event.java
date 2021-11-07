package com.hua.observer.childcry;

/**
 * 事件  定义被监听的不同的行为
 * 把通知变成一个Event对象，从而不再有多种方法通知，而是统一成一种。
 * 有很多时候，观察者需要根据事件的具体情况来进行处理
 * 大多数时候，我们处理事件的时候，需要事件源对象。
 * @param <T>
 */
abstract class Event<T> {
	abstract T getSource();
}