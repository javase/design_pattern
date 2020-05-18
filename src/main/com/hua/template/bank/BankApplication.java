package com.hua.template.bank;

import static com.hua.util.Print.*;

import com.hua.util.Print;

/**
 * 模板方法模式
 * created at 2019-06-30 11:26
 * @author lerry
 */
public class BankApplication {

	public static void main(String[] args) {
		BaseBank bank = new Transfer();
		bank.templateMethodProcess(true);
		print("--------------------------");
		bank = new Deposit();
		bank.templateMethodProcess(false);
	}
}

/**
 * 抽象类
 */
abstract class BaseBank {

	private int number;

	/**
	 * 模板方法
	 * 模板方法模式中，迫使子类实现的抽象方法应该声明为protected abstract
	 * final方法：表示方法不可被子类重写（覆盖）
	 * @param isEvaluate
	 */
	protected final void templateMethodProcess(boolean isEvaluate) {
		takeNumber();
		transact();
		if (isEvaluateHook(isEvaluate)) {
			evaluateHook();
		}
		else {
			print("this is a normal customer");
		}
	}

	private int takeNumber() {
		Print.printlnf("取号[%d]", this.number);
		return this.number;
	}

	/**
	 * 办理业务
	 */
	protected abstract void transact();

	/**
	 * <pre>
	 * 基本方法-钩子方法
	 * 1. 钩子方法的引入使得子类可以控制父类的行为
	 * 2. 最简单的钩子方法就是空方法，也可以在钩子方法中定义一个默认的实现，如果子类不覆盖钩子方法，则执行父类的默认实现代码。
	 * 3. 比较复杂一点的钩子方法可以对其他方法进行约束，这种钩子方法通常返回一个boolean类型，
	 * 即返回true或false，用来判断是否执行某一个基本方法。由子类来决定是否调用hook方法。
	 * </pre>
	 */
	protected void evaluateHook() {
		print("evaluateHook()");
		print("this is a VIP customer");
	}

	protected boolean isEvaluateHook(boolean isEvaluate) {
		return isEvaluate;
	}
}

/**
 * 具体子类：存款
 */
class Deposit extends BaseBank {

	@Override
	protected void transact() {
		Print.printlnf("办理[%s]业务", "存款");
	}
}

/**
 * 具体子类：取款
 */
class Withdraw extends BaseBank {

	@Override
	protected void transact() {
		Print.printlnf("办理[%s]业务", "取款");
	}
}

/**
 * 具体子类：转账
 */
class Transfer extends BaseBank {

	@Override
	protected void transact() {
		Print.printlnf("办理[%s]业务", "转账");
	}
}


