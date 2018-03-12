package com.hua.data_access;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by limenghua on 2018/3/12.
 * @author limenghua
 */
public class DataAccessApplication {
}

class Student {
	private int no;

	private String name;

	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

interface StudentDao {
	List<Student> getAllStudents();

	Student getStudent(String no);

	void updateStudent(Student student);

	void delStudent(Student student);
}

class StudentDaoImpl implements StudentDao {

	// 列表当成一个数据库
	static List<Student> students;

	static {
		students = new ArrayList<>();
		Student student1 = new Student(1001, "汪峰");
		Student student2 = new Student(1002, "章子怡");
		students.add(student1);
		students.add(student2);
	}

	@Override
	public List<Student> getAllStudents() {
		return null;
	}

	@Override
	public Student getStudent(String no) {
		return null;
	}

	@Override
	public void updateStudent(Student student) {

	}

	@Override
	public void delStudent(Student student) {

	}
}
