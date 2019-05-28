package com.hua.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lerry on 2017/10/25.
 * @author lerry
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
