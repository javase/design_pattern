package com.hua.builder.computer;

/**
 * 客户端 （Client） 必须将某个生成器对象与主管类关联。
 * 一般情况下， 你只需通过主管类构造函数的参数进行一次性关联即可。
 * 此后主管类就能使用生成器对象完成后续所有的构造任务。 但在客户端将生成器对象传递给主管类制造方法时还有另一种方式。 在这种情况下， 你在使用主管类生产产品时每次都可以使用不同的生成器。
 * created at 2021-11-11 12:48
 * @author lerry
 */
public class BuilderClient {
	public static void main(String[] args) {
		//1
		Director director = new Director();
		//2
		BaseBuilder builder = new MacComputerBuilder("I7处理器", "三星DDR4");
		//3
		director.makeComputer(builder);
		//4
		Computer macComputer = builder.getComputer();
		System.out.println("mac computer:" + macComputer.toString());

		BaseBuilder lenovoBuilder = new LenovoComputerBuilder("龙芯处理器", "海力士DDR4");
		director.makeComputer(lenovoBuilder);
		Computer lenovoComputer = lenovoBuilder.getComputer();
		System.out.println("lenovo computer:" + lenovoComputer.toString());
	}
}
