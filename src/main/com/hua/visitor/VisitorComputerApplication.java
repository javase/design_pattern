package com.hua.visitor;

/**
 * Created by limenghua on 2018/3/2.
 * @author limenghua
 */
public class VisitorComputerApplication {
	public static void main(String[] args) {
		ComputerPart computerPart = new Computer();
		computerPart.accept(new ComputorPartDisplayVisitor());
	}
}

interface ComputerPart {
	void accept(ComputorPartVisitor visitor);
}

class KeyBoard implements ComputerPart {

	@Override
	public void accept(ComputorPartVisitor visitor) {
		visitor.visit(this);
	}
}

class Monitor implements ComputerPart {

	@Override
	public void accept(ComputorPartVisitor visitor) {
		visitor.visit(this);
	}
}


class Mouse implements ComputerPart {

	@Override
	public void accept(ComputorPartVisitor visitor) {
		visitor.visit(this);
	}
}

class Computer implements ComputerPart {

	ComputerPart[] parts;

	public Computer() {
		this.parts = new ComputerPart[] {new KeyBoard(), new Mouse(), new Monitor()};
	}

	@Override
	public void accept(ComputorPartVisitor visitor) {
		for (int i = 0; i < parts.length; i++) {
			parts[i].accept(visitor);
		}
		visitor.visit(this);
	}
}

interface ComputorPartVisitor {
	void visit(KeyBoard keyBoard);

	void visit(Monitor monitor);

	void visit(Mouse mouse);

	void visit(Computer computer);
}

/**
 * 具体元素对访问者公开细节
 */
class ComputorPartDisplayVisitor implements ComputorPartVisitor {

	@Override
	public void visit(KeyBoard keyBoard) {
		System.out.println("Displaying KeyBoard.");
	}

	@Override
	public void visit(Monitor monitor) {
		System.out.println("Displaying Monitor.");
	}

	@Override
	public void visit(Mouse mouse) {
		System.out.println("Displaying Mouse.");
	}

	@Override
	public void visit(Computer computer) {
		System.out.println("Displaying Computer.");
	}
}
