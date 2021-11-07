package com.hua.observer.childcry;

/**
 * 事件  定义被监听的不同的行为
 * @param <T>
 */
abstract class Event<T> {
	abstract T getSource();
}