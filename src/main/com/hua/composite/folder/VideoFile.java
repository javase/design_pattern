package com.hua.composite.folder;

/**
 * Created by lerry on 2017/11/13.
 * @author lerry
 */
public class VideoFile extends File {
	public VideoFile(String name) {
		super(name);
	}

	@Override
	public void display() {
		System.out.println("这是影像文件，文件名：" + super.getName());
	}
}
