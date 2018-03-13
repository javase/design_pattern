package com.hua.data_access;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by limenghua on 2018/3/12.
 * @author limenghua
 */
public class DataAccessApplication {

	public static void main(String[] args) {

		StudentDao studentDao = new StudentDaoImpl();
		// 输出所有的学生
		List<Student> students = studentDao.getAllStudents();
		for (Student student : students) {
			System.out.println(student);
		}

		// 更新学生
		Student student = students.get(0);
		student.setName("王语嫣");
		studentDao.updateStudent(student);
		System.out.println(student);

		// 删除
		studentDao.delStudent(student);
		System.out.println("after del");
		// 输出所有的学生
		for (Student s : students) {
			System.out.println(s);
		}
	}
}

/**
 * 模型对象/数值对象
 */
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

	@Override
	public String toString() {
		return "Student{" +
				"no=" + no +
				", name='" + name + '\'' +
				'}';
	}
}

/**
 * 数据访问对象接口
 */
interface StudentDao {
	List<Student> getAllStudents();

	Student getStudent(int no);

	void updateStudent(Student student);

	void delStudent(Student student);
}

/**
 * 数据访问对象实体类
 */
class StudentDaoImpl implements StudentDao {

	// 列表当成一个数据库
	static List<Student> students;

	static {
		students = new ArrayList<>();
		Student student1 = new Student(0, "汪峰");
		Student student2 = new Student(1, "章子怡");
		students.add(student1);
		students.add(student2);
	}

	@Override
	public List<Student> getAllStudents() {
		return students;
	}

	@Override
	public Student getStudent(int no) {
		return students.get(no);
	}

	@Override
	public void updateStudent(Student student) {
		students.get(student.getNo()).setName(student.getName());
		System.out.println(String.format("update [%d] name to [%s]", student.getNo(), students.get(student.getNo()).getName()));
	}

	@Override
	public void delStudent(Student student) {
		students.remove(student.getNo());
	}
}
