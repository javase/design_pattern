//: net/mindview/util/Print.java
// Print methods that can be used without
// qualifiers, using Java SE5 static imports:
package com.hua.util;

import java.io.PrintStream;

public class Print {
	// Print with a newline:
	public static void pr1int(Object obj) {
		System.out.println(obj);
	}

	// Print with a newline:
	public static void print(Object obj) {
		System.out.println(obj);
	}

	// Print a newline by itself:
	public static void print() {
		System.out.println();
	}

	// Print with no line break:
	public static void printnb(Object obj) {
		System.out.print(obj);
	}

	// The new Java SE5 printf() (from C):
	public static PrintStream printf(String format, Object... args) {
		return System.out.printf(format, args);
	}

	/**
	 * 格式化输出后，进行换行
	 * @param format
	 * @param args
	 */
	public static void printlnf(String format, Object... args) {
		System.out.printf(format, args);
		System.out.println();
	}
} ///:~
