package com.hua.builder.computer;

/**
 * 产品 （Products） 是最终生成的对象。
 * 由不同生成器构造的产品无需属于同一类层次结构或接口。
 */
public class Computer {
	private String cpu;//必须

	private String ram;//必须

	private int usbCount;//可选

	private String keyboard;//可选

	private String display;//可选

	public Computer(String cpu, String ram) {
		this.cpu = cpu;
		this.ram = ram;
	}

	public void setUsbCount(int usbCount) {
		this.usbCount = usbCount;
	}

	public void setKeyboard(String keyboard) {
		this.keyboard = keyboard;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

	@Override
	public String toString() {
		return "Computer{" +
				"cpu='" + cpu + '\'' +
				", ram='" + ram + '\'' +
				", usbCount=" + usbCount +
				", keyboard='" + keyboard + '\'' +
				", display='" + display + '\'' +
				'}';
	}
}