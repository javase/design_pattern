package com.hua.iterator.v7;

/**
 * 客户端 （Client） 通过集合和迭代器的接口与两者进行交互。
 * 这样一来客户端无需与具体类进行耦合， 允许同一客户端代码使用各种不同的集合和迭代器。
 * 客户端通常不会自行创建迭代器， 而是会从集合中获取。
 * 但在特定情况下， 客户端可以直接创建一个迭代器 （例如当客户端需要自定义特殊迭代器时）。
 */
public class Client {
	public static void main(String[] args) {
		// Collection_<String> list = new ArrayList_<>();
		// 可以很方便地替换为另一个具体集合
		Collection_<String> list = new LinkedList_();
		for (int i = 0; i < 15; i++) {
			list.add("s" + i);
		}
		System.out.printf("集合容量为：%d\n", list.size());

		//这个接口的调用方式：
		Iterator_<String> it = list.iterator();
		while (it.hasNext()) {
			String o = it.next();
			System.out.println(o);
		}
	}
}