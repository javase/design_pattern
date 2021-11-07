package com.hua.observer.childcry;

/**
 * 事件  定义被监听的不同的行为
 * 把通知变成一个Event对象，从而不再有多种方法通知，而是统一成一种
 * @param <T>
 */
abstract class Event<T> {
	abstract T getSource();
}