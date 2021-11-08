package com.hua.composite.tree;

/**
 * 客户端 （Client） 通过组件接口与所有项目交互。
 * 因此， 客户端能以相同方式与树状结构中的简单或复杂项目交互。
 */
public class Client {
	public static void main(String[] args) {
		CompositeNode root = new CompositeNode("root");
		CompositeNode chapter1 = new CompositeNode("chapter1");
		CompositeNode chapter2 = new CompositeNode("chapter2");
		Node r1 = new LeafNode("r1");
		Node c11 = new LeafNode("c11");
		Node c12 = new LeafNode("c12");
		CompositeNode b21 = new CompositeNode("section21");
		Node c211 = new LeafNode("c211");
		Node c212 = new LeafNode("c212");

		root.add(chapter1);
		root.add(chapter2);
		root.add(r1);
		chapter1.add(c11);
		chapter1.add(c12);
		chapter2.add(b21);
		b21.add(c211);
		b21.add(c212);

		tree(root, 0);

	}

	/**
	 * 递归输出各层次节点
	 * @param b
	 * @param depth
	 */
	static void tree(Node b, int depth) {
		for (int i = 0; i < depth; i++) {
			System.out.print("--:");
		}
		b.print();

		if (b instanceof CompositeNode) {
			for (Node n : ((CompositeNode) b).nodes) {
				tree(n, depth + 1);
			}
		}
	}
}
