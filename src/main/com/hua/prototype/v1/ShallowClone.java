package com.hua.prototype.v1;

/**
 * 浅克隆
 */
public class ShallowClone {
	public static void main(String[] args) throws Exception {
		Person p1 = new Person();
		Person p2 = (Person) p1.clone();
		System.out.printf("克隆对象的age:%s,score:%s\n", p2.age, p2.score);
		System.out.printf("克隆对象的loc：%s\n", p2.loc);

		System.out.printf("克隆对象和原对象是否==？ %s\n", p1 == p2);
		System.out.printf("克隆对象的loc和原对象的loc是否==？ %s\n", p1.loc == p2.loc);
		// 当原有对象（被克隆）的引用类型成员变量被修改时，克隆对象的这个成员变量会一起被更改
		p1.loc.street = "sh";
		System.out.printf("原对象的loc被修改后，查看克隆对象的loc：%s\n", p2.loc);

	}
}

class Person implements Cloneable {
	int age = 8;

	int score = 100;

	Location loc = new Location("bj", 22);

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class Location {
	String street;

	int roomNo;

	@Override
	public String toString() {
		return "Location{" +
				"street='" + street + '\'' +
				", roomNo=" + roomNo +
				'}';
	}

	public Location(String street, int roomNo) {
		this.street = street;
		this.roomNo = roomNo;
	}
}
