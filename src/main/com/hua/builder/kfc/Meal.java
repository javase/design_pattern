package com.hua.builder.kfc;

import static com.hua.util.Print.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 一顿饭，持有对餐饮条目的引用，包含一些公用方法
 * Created by lerry on 2017/9/26.
 * @author lerry
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
			printlnf("Item:%-10sPacking:%-10s\tPrice:$%-10.2f", item.name(), item.packing().pack(), item.price());
		}
	}
}
