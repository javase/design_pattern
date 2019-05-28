package com.hua.composite.folder;

/**
 * Created by lerry on 2017/11/13.
 * @author lerry
 */
public class TextFile extends File {
	public TextFile(String name) {
		super(name);
	}

	@Override
	public void display() {
		System.out.println("这是文本文件，文件名：" + super.getName());
	}
}
