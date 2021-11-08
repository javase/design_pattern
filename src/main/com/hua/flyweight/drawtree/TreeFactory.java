package com.hua.flyweight.drawtree;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂
 * 封装创建享元的复杂机制
 */
public class TreeFactory {
	static Map<String, TreeType> treeTypes = new HashMap<>();

	public static TreeType getTreeType(String name, Color color, String otherTreeData) {
		TreeType result = treeTypes.get(name);
		if (result == null) {
			result = new TreeType(name, color, otherTreeData);
			treeTypes.put(name, result);
		}
		return result;
	}
}