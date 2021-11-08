package com.hua.flyweight.string;

/**
 * java.lang.String使用了享元模式
 * created at 2021-11-08 14:07
 * @author lerry
 */
public class StringDemo {
	public static void main(String[] args) {
		String s1 = "abcdefg";
		String s2 = "abcdefg";
		String s3 = new String("abcdefg");
		String s4 = new String("abcdefg");
		System.out.printf("s1 == s2:%s\n", s1 == s2);
		System.out.printf("s1 == s3:%s\n", s1 == s3);
		System.out.printf("s3 == s4:%s\n", s3 == s4);
		System.out.printf("s3.intern() == s1:%s\n", s3.intern() == s1);
		System.out.printf("s3.intern() == s4.intern():%s\n", s3.intern() == s4.intern());
	}
}
