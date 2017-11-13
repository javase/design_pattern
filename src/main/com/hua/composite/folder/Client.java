package com.hua.composite.folder;

/**
 * Created by limenghua on 2017/11/13.
 * @author limenghua
 */
public class Client {

	public static void main(String[] args) {
		/**
		 * 建立一个文件系统
		 * 总文件夹
		 *  a.txt    b.jpg                   c文件夹
		 *  						c_1.txt  c_1.rmvb    c_1.jpg
		 */
		Folder totalFolder = new Folder("总文件夹");
		File aFile = new TextFile("a.txt");
		File bFile = new ImageFile("b.jpg");

		Folder cFoler = new Folder("c文件夹");
		File cFile = new TextFile("c_1.txt");
		File video = new VideoFile("c_1.rmvb");
		File c1File = new ImageFile("c_1.jpg");

		totalFolder.addFile(aFile);
		totalFolder.addFile(bFile);
		totalFolder.addFile(cFoler);
		cFoler.addFile(cFile);
		cFoler.addFile(video);
		cFoler.addFile(c1File);

		System.out.println("----------------");
		totalFolder.display();

		cFoler.removeFile(video);
		System.out.println("after remove : -----------");
		totalFolder.display();

	}
}
