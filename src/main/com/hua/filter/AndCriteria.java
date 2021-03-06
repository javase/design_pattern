package com.hua.filter;

import java.util.List;

/**
 * Created by lerry on 2017/10/25.
 * @author lerry
 */
public class AndCriteria implements Criteria {

	private Criteria criteria;

	private Criteria otherCriteria;

	public AndCriteria(Criteria criteria, Criteria otherCriteria) {
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
		return otherCriteria.meetCriteria(firstCriteriaPersons);
	}
}
