package com.hua.template.cook;

/**
 * 包菜
 * 具体类 （Concrete­Class） 可以重写所有步骤， 但不能重写模板方法自身。
 * Created by lerry on 2017/11/14.
 * @author lerry
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
