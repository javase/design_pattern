package com.hua.builder.computer;

/**
 * 具体生成器 （Concrete Builders） 提供构造过程的不同实现。
 * 具体生成器也可以构造不遵循通用接口的产品。
 * 联想电脑
 */
public class LenovoComputerBuilder extends ComputerBuilder {
	private Computer computer;

	public LenovoComputerBuilder(String cpu, String ram) {
		computer = new Computer(cpu, ram);
	}

	@Override
	public void setUsbCount() {
		computer.setUsbCount(4);
	}

	@Override
	public void setKeyboard() {
		computer.setKeyboard("联想键盘");
	}

	@Override
	public void setDisplay() {
		computer.setDisplay("联想显示器");
	}

	@Override
	public Computer getComputer() {
		return computer;
	}
}