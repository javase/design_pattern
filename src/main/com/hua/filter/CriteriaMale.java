package com.hua.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by limenghua on 2017/10/25.
 * @author limenghua
 */
public class CriteriaMale implements Criteria {
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> malePersons = new ArrayList<Person>();
		for (Person malePerson : persons) {
			if ("MALE".equalsIgnoreCase(malePerson.getGender())) {
				malePersons.add(malePerson);
			}
		}
		return malePersons;
	}
}
