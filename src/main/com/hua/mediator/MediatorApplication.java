package com.hua.mediator;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 中介类
 * 用一个中介对象来封装一系列的对象交互，中介者使各对象不需要显式地相互引用，从而使其耦合松散
 */
class ChatRoom {
	public static void showMessage(User user, String message) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String now = simpleDateFormat.format(new Date());
		String msg = String.format("%s	[%s]:%s", now, user.getName(), message);
		System.out.println(msg);
	}
}

class User {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User(String name) {
		this.name = name;
	}

	public void sendMessage(String message) {
		ChatRoom.showMessage(this, message);
	}
}

public class MediatorApplication {
	public static void main(String[] args) {

		User robert = new User("Robert");
		User john = new User("John");

		robert.sendMessage("Hi! John!");
		john.sendMessage("Hello! Robert!");
	}
}