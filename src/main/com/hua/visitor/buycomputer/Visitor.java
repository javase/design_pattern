package com.hua.visitor.buycomputer;

/**
 * 访问者 （Visitor） 接口声明了一系列以对象结构的具体元素为参数的访问者方法。
 * 如果编程语言支持重载， 这些方法的名称可以是相同的， 但是其参数一定是不同的。
 */
interface Visitor {
	void visit(CPU cpu);

	void visit(Memory memory);

	void visit(Board board);
}