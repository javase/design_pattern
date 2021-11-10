package com.hua.visitor.buycomputer;

/**
 * 客户端 （Client） 通常会作为集合或其他复杂对象 （例如一个组合树） 的代表。
 * 客户端通常不知晓所有的具体元素类，
 * 因为它们会通过抽象接口与集合中的对象进行交互。
 */
public class ComputerClient {
	ComputerPart cpu = new CPU();

	ComputerPart memory = new Memory();

	ComputerPart board = new Board();

	public void acccept(Visitor v) {
		this.cpu.accept(v);
		this.memory.accept(v);
		this.board.accept(v);
	}

	public static void main(String[] args) {
		PersonelVisitor p = new PersonelVisitor();
		new ComputerClient().acccept(p);
		System.out.println(p.totalPrice);
	}
}