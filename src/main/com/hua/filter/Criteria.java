package com.hua.filter;

import java.util.List;

/**
 * Created by lerry on 2017/10/25.
 * @author lerry
 */
public interface Criteria {

	List<Person> meetCriteria(List<Person> persons);
}
