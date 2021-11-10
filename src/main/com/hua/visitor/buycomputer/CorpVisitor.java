package com.hua.visitor.buycomputer;

/**
 * 具体访问者 （Concrete Visitor） 会为不同的具体元素类实现相同行为的几个不同版本。
 * 企业买家
 */
class CorpVisitor implements Visitor {
	double totalPrice = 0.0;

	@Override
	public void visit(CPU cpu) {
		totalPrice += cpu.getPrice() * 0.6;
	}

	@Override
	public void visit(Memory memory) {
		totalPrice += memory.getPrice() * 0.75;
	}

	@Override
	public void visit(Board board) {
		totalPrice += board.getPrice() * 0.75;
	}
}