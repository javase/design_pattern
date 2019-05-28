package com.hua.composite.folder;

/**
 * Created by lerry on 2017/11/13.
 * @author lerry
 */
public class ImageFile extends File {
	public ImageFile(String name) {
		super(name);
	}

	@Override
	public void display() {
		System.out.println("这是图像文件，文件名：" + super.getName());
	}
}
