package com.hua.flyweight.drawtree;

import java.awt.*;

/**
 * 单独的享元对象
 * 重复数据- 包含多棵树共享的状态
 */
public class TreeType {
	/**
	 * 名称
	 */
	private String name;

	/**
	 * 颜色
	 */
	private Color color;

	private String otherTreeData;

	public TreeType(String name, Color color, String otherTreeData) {
		this.name = name;
		this.color = color;
		this.otherTreeData = otherTreeData;
	}

	public void draw(Graphics g, int x, int y) {
		g.setColor(Color.BLACK);
		g.fillRect(x - 1, y, 3, 5);
		g.setColor(color);
		g.fillOval(x - 5, y - 10, 10, 10);
	}
}