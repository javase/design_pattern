package com.hua.builder.kfc;

import java.util.ArrayList;
import java.util.List;

/**
 * 一顿饭，持有对餐饮条目的引用，包含一些公用方法
 * Created by limenghua on 2017/9/26.
 * @author limenghua
 */
public class Meal {
	private List<Item> items = new ArrayList<>();

	public void addItem(Item item) {
		items.add(item);
	}

	public float getCost() {
		float total = 0f;
		for (Item item : items) {
			total += item.price();
		}
		return total;
	}

	public void showItems() {
		for (Item item : items) {
			System.out.println(String.format("Item:%s,Packing:%s,Price:%f", item.name(), item.packing().pack(), item.price()));
		}
	}
}
