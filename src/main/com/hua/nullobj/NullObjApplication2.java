package com.hua.nullobj;

/**
 * Created by limenghua on 2018/2/28.
 * @author limenghua
 */
public class NullObjApplication2 {
	public static void main(String[] args) {
		AbstractCustomer customer01 = CustomerFactory.getCustomerInstance("LiuBei");
		AbstractCustomer customer02 = CustomerFactory.getCustomerInstance("guanyu");
		AbstractCustomer customer03 = CustomerFactory.getCustomerInstance("zhangfei");
		AbstractCustomer customer04 = CustomerFactory.getCustomerInstance("lvBu");
		System.out.println("customers:");
		System.out.println(customer01.getName());
		System.out.println(customer02.getName());
		System.out.println(customer03.getName());
		System.out.println(customer04.getName());
	}

}

abstract class AbstractCustomer {
	protected String name;

	public abstract boolean isNil();

	public abstract String getName();
}

class RealCustomer extends AbstractCustomer {
	public RealCustomer(String name) {
		this.name = name;
	}

	@Override
	public boolean isNil() {
		return false;
	}

	@Override
	public String getName() {
		return name;
	}
}

class NullCustomer extends AbstractCustomer {

	@Override
	public boolean isNil() {
		return true;
	}

	@Override
	public String getName() {
		return "Not available in customer database";
	}
}

/**
 * 使用 CustomerFactory，基于客户传递的名字，来获取 RealCustomer 或 NullCustomer 对象。
 */
class CustomerFactory {
	public static final String[] names = {"LiuBei", "GuanYu", "ZhangFei"};

	public static AbstractCustomer getCustomerInstance(String nameP) {
		for (String name : names) {
			if (name.equalsIgnoreCase(nameP)) {
				return new RealCustomer(nameP);
			}
		}
		return new NullCustomer();
	}
}


