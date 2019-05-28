package com.hua.composite.folder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lerry on 2017/11/13.
 * @author lerry
 */
public class Folder extends File {

	private List<File> files;

	public Folder(String name) {
		super(name);
		files = new ArrayList<>();
	}

	@Override
	public void display() {
		for (File file : files) {
			file.display();
		}
	}

	public void addFile(File file) {
		files.add(file);
	}

	public void removeFile(File file) {
		files.remove(file);
	}
}
