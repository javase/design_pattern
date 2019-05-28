package com.hua.business_delegate;

/**
 * Created by lerry on 2018/3/9.
 * @author lerry
 */
public class BusinessDelegateApplication {
	public static void main(String[] args) {
		BusinessDelegate delegate = new BusinessDelegate();
		delegate.setServiceType("EJB");
		Client client = new Client(delegate);
		client.doTask();

		delegate.setServiceType("jms");
		client.doTask();
	}
}

interface IBusinessService {
	void doProcessing();
}

class EJBService implements IBusinessService {

	@Override
	public void doProcessing() {
		System.out.println("EJB 服务");
	}
}

class JMSService implements IBusinessService {

	@Override
	public void doProcessing() {
		System.out.println("JMS 服务");
	}
}

/**
 * 业务查询服务类
 */
class BusinessLookUp {
	public IBusinessService getBusinessDelegate(String serviceType) {
		if (serviceType.equalsIgnoreCase("ejb")) {
			return new EJBService();
		}
		else {
			return new JMSService();
		}
	}
}

/**
 * 业务代表类
 */
class BusinessDelegate {

	private BusinessLookUp businessLookUp = new BusinessLookUp();

	private IBusinessService iBusinessService;

	private String serviceType;

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public void doTask() {
		iBusinessService = businessLookUp.getBusinessDelegate(serviceType);
		iBusinessService.doProcessing();
	}
}

/**
 * 客户端类
 */
class Client {
	private BusinessDelegate businessDelegate;

	public Client(BusinessDelegate businessDelegate) {
		this.businessDelegate = businessDelegate;

	}
	public void doTask() {
		businessDelegate.doTask();
	}
}
