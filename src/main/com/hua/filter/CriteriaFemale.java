package com.hua.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lerry on 2017/10/25.
 * @author lerry
 */
public class CriteriaFemale implements Criteria {
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> femalePersons = new ArrayList<Person>();
		for (Person femalePerson : persons) {
			if ("FEMALE".equalsIgnoreCase(femalePerson.getGender())) {
				femalePersons.add(femalePerson);
			}
		}
		return femalePersons;
	}
}
