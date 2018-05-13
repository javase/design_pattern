package com.hua.template.cook;

/**
 * Created by limenghua on 2017/11/14.
 * @author limenghua
 */
public class CabbageCook extends AbstractCookClass {
	@Override
	void pourVegtable() {
		System.out.println("下锅炒的是包菜");
	}

	@Override
	void pourSauce() {
		System.out.println("包菜放的调料是辣椒");
	}
}
