package com.hua.nullobj;

import java.util.Scanner;

/**
 * Created by lerry on 2018/2/28.
 * @author lerry
 */
public class NullObjApplication {

	static void customer(StudentFactory sf) {
		String s = sf.getStudentInstance().query();
		System.out.println(s);
	}

	public static void main(String[] args) {
		while (true) { // 不间断输入，-1退出程序
			customer(new StudentFactory());
		}
	}
}

// 首先定义一个为查询和空对象的类定义一个共同的接口
interface AbstractStudent {
	String query();
}

/**
 * 查询学号的具体实现
 */
class RealObject implements AbstractStudent {
	@Override
	public String query() {
		return "query success";
	}
}

/**
 * 空对象类
 */
class NullObject implements AbstractStudent {

	@Override
	public String query() {
		return "can not find this student";
	}
}

/**
 * 建造工厂
 */
class StudentFactory {
	int[] array = {1, 2, 3, 4, 5};

	public AbstractStudent getStudentInstance() {
		// 模拟输入学号
		Scanner input = new Scanner(System.in);
		System.out.print("please input your student no :");
		int index = input.nextInt();
		if (index == -1) {
			System.exit(0);
		}
		for (int i : array) {
			if (i == index) {
				return new RealObject();
			}
		}
		return new NullObject();
	}// end method

}