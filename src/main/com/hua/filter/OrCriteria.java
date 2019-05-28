package com.hua.filter;

import java.util.List;

/**
 * Created by lerry on 2017/10/25.
 * @author lerry
 */
public class OrCriteria implements Criteria {

	private Criteria criteria;

	private Criteria otherCriteria;

	public OrCriteria(Criteria criteria, Criteria otherCriteria) {
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}

	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
		List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);
		for (Person otherCriteriaItem : otherCriteriaItems) {
			// 若不包含，则去重后加入返回结果中
			if (!firstCriteriaItems.contains(otherCriteriaItem)) {
				firstCriteriaItems.add(otherCriteriaItem);
			}
		}
		return firstCriteriaItems;
	}

	public static void printPersons(List<Person> persons) {
		for (Person person : persons) {
			System.out.println("Person : [ Name : " + person.getName()
					+ ", Gender : " + person.getGender()
					+ ", Marital Status : " + person.getMaritalStatus()
					+ " ]");
		}
	}
}
