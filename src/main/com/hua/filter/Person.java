package com.hua.filter;

import lombok.Data;

/**
 * Created by lerry on 2017/10/25.
 * @author lerry
 */
@Data
public class Person {

	private String name;

	private String gender;

	private String maritalStatus;

	public Person(String name, String gender, String maritalStatus) {
		this.name = name;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
	}


}
