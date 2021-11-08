package com.hua.composite.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 容器 （Container）——又名 “组合 （Composite）”——是包含叶节点或其他容器等子项目的单位。
 * 容器不知道其子项目所属的具体类， 它只通过通用的组件接口与其子项目交互。
 */
class CompositeNode implements Node {
	List<Node> nodes = new ArrayList<>();

	String name;

	public CompositeNode(String name) {
		this.name = name;
	}

	@Override
	public void print() {
		System.out.println(name);
	}

	public void add(Node n) {
		nodes.add(n);
	}
}