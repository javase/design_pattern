package com.hua.mvc;

/**
 * MVC 模式代表 Model-View-Controller（模型-视图-控制器） 模式
 * Created by lerry on 2018/3/8.
 * @author lerry
 */
public class MvcApplication {

	public static void main(String[] args) {
		// 读数据
		Student model = readFromDB();

		// 创建视图
		StudentView studentView = new StudentView();

		StudentController controller = new StudentController(model, studentView);
		controller.updateView();

		controller.setStudentNo("1002");
		controller.setStudentName("LeiJun");
		controller.updateView();
	}

	/**
	 * 模拟从数据库读取数据
	 * @return
	 */
	public static Student readFromDB() {
		Student student = new Student("1001", "LiuQiangDong");
		return student;
	}
}

class Student {
	private String no;

	private String name;

	public Student(String no, String name) {
		this.no = no;
		this.name = name;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class StudentView {
	public void printStudentDetails(String no, String name) {
		String msg = String.format("Student no:%s,name:%s", no, name);
		System.out.println(msg);
	}
}

class StudentController {
	private Student model;

	private StudentView view;

	public StudentController(Student model, StudentView view) {
		this.model = model;
		this.view = view;
	}


	public void setStudentName(String name) {
		model.setName(name);
	}

	public void setStudentNo(String no) {
		model.setNo(no);
	}

	public void updateView() {
		view.printStudentDetails(model.getNo(), model.getName());
	}
}
