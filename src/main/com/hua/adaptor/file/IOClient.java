package com.hua.adaptor.file;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 读取文件，转为InputStreamReader，然后使用BufferedReader进行输出
 * created at 2021-11-12 12:45
 * @author lerry
 */
public class IOClient {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("/Users/lerry/Temp/adaptor.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		String line = br.readLine();
		while (line != null && !line.equals("")) {
			System.out.println(line);
			line = br.readLine();
		}
		br.close();
	}
}
