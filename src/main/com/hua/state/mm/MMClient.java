package com.hua.state.mm;

/**
 * created at 2021-11-23 14:54
 * @author lerry
 */
public class MMClient {
	public static void main(String[] args) {
		MM mm = new MM("lily", new MMHappyState());
		mm.smile();
		mm.cry();
		mm.say();

		System.out.println("------------------------------");

		mm.changeState(new MMNervousState());
		mm.smile();
		mm.cry();
		mm.say();
	}
}
