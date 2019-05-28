package com.hua.builder.kfc;

import com.hua.builder.kfc.impl.ChickenBurger;
import com.hua.builder.kfc.impl.Coke;
import com.hua.builder.kfc.impl.Pepsi;
import com.hua.builder.kfc.impl.VegBurger;

/**
 * 实际的 builder 类，负责创建 Meal 对象
 * 依赖具体的产品
 * Created by lerry on 2017/9/26.
 * @author lerry
 */
public class MealBuilder {

	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}

	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}
