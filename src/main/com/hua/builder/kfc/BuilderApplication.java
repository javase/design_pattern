package com.hua.builder.kfc;

/**
 * 主程序演示
 * 导演类，依赖建造者
 * Created by limenghua on 2017/9/26.
 * @author limenghua
 */
public class BuilderApplication {
	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();
		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("素食餐");
		vegMeal.showItems();
		System.out.println(String.format("总消费：%f", vegMeal.getCost()));
		System.out.println("-------------------------------------");
		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("肉食餐");
		nonVegMeal.showItems();
		System.out.println(String.format("总消费：%f", nonVegMeal.getCost()));
	}
}
