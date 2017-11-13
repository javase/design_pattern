package com.hua.composite.folder;

/**
 * 统一接口（抽象类）
 * Created by limenghua on 2017/11/13.
 * @author limenghua
 */
public abstract class File {
	private String name;

	public File(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void display();
}
