package com.hua.principle.single;

/**
 * 我们会发现如果这样修改花销是很大的，除了将原来的类分解之外，还需要修改客户端。
 * 接着看一种不需要修改客户端的方式：AnimalNoModifyClientApplication
 * Created by lerry on 2018/3/2.
 * @author lerry
 */
public class AnimalTwoApplication {
	public static void main(String[] args) {
		// 客户端也需要修改
		Terrestrial terrestrial = new Terrestrial();
		terrestrial.breathe("牛");
		terrestrial.breathe("羊");
		terrestrial.breathe("鸡");
		Aquatic aquatic = new Aquatic();
		aquatic.breathe("鲨鱼");
	}
}


class Terrestrial {
	public void breathe(String animal) {
		System.out.println(String.format("%s呼吸空气", animal));
	}
}

class Aquatic {
	public void breathe(String animal) {
		System.out.println(String.format("%s在水里呼吸", animal));
	}
}
