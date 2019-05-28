package com.hua.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lerry on 2017/10/25.
 * @author lerry
 */
public class FilterApplication {
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();

		persons.add(new Person("汪峰", "Male", "Single"));
		persons.add(new Person("张杰", "Male", "Married"));
		persons.add(new Person("范冰冰", "Female", "Married"));
		persons.add(new Person("刘亦菲", "Female", "Single"));
		persons.add(new Person("王力宏", "Male", "Single"));
		persons.add(new Person("林俊杰", "Male", "Single"));

		Criteria male = new CriteriaMale();
		Criteria female = new CriteriaFemale();
		Criteria single = new CriteriaSingle();
		Criteria singleMale = new AndCriteria(single, male);
		Criteria singleOrFemale = new OrCriteria(single, female);


		System.out.println("Males: ");
		printPersons(male.meetCriteria(persons));

		System.out.println("\nFemales: ");
		printPersons(female.meetCriteria(persons));

		System.out.println("\nSingle Males: ");
		printPersons(singleMale.meetCriteria(persons));

		System.out.println("\nSingle Or Females: ");
		printPersons(singleOrFemale.meetCriteria(persons));
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
