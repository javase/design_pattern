package com.hua.composite.tree;

/**
 * 叶节点 （Leaf） 是树的基本结构， 它不包含子项目。
 * 一般情况下， 叶节点最终会完成大部分的实际工作， 因为它们无法将工作指派给其他部分。
 */
class LeafNode implements Node {
	String content;

	public LeafNode(String content) {
		this.content = content;
	}

	@Override
	public void print() {
		System.out.println(content);
	}
}