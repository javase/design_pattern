package com.hua.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lerry on 2017/10/25.
 * @author lerry
 */
public class CriteriaSingle implements Criteria {
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> singlePersons = new ArrayList<Person>();
		for (Person singlePerson : persons) {
			if ("SINGLE".equalsIgnoreCase(singlePerson.getMaritalStatus())) {
				singlePersons.add(singlePerson);
			}
		}
		return singlePersons;
	}
}
