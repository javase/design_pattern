package com.hua.builder.kfc;

import static com.hua.util.Print.*;

/**
 * 主程序演示
 * 导演类，依赖建造者
 * Created by lerry on 2017/9/26.
 * @author lerry
 */
public class BuilderApplication {
	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();
		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("素食餐");
		vegMeal.showItems();
		printlnf("总消费：$%.2f", vegMeal.getCost());
		System.out.println("-------------------------------------");
		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("肉食餐");
		nonVegMeal.showItems();
		printlnf("总消费：$%.2f", nonVegMeal.getCost());
	}
}
