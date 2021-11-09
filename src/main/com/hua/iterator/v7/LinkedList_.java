package com.hua.iterator.v7;

/**
 * 相比数组，这个容器不用考虑边界问题，可以动态扩展
 */
public class LinkedList_<E> implements Collection_<E> {
	Node head = null;

	Node tail = null;

	//目前容器中有多少个元素
	private int size = 0;

	@Override
	public void add(E o) {
		Node n = new Node(o);
		n.next = null;

		if (head == null) {
			head = n;
			tail = n;
		}

		tail.next = n;
		tail = n;
		size++;
	}

	private class Node<E> {
		private E o;

		Node<E> next;

		public Node(E o) {
			this.o = o;
		}
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public Iterator_ iterator() {
		return new LinkedListIterator<E>();
	}

	private class LinkedListIterator<E> implements Iterator_<E> {
		private Node<E> cucurrentNode = head;

		@Override
		public boolean hasNext() {
			return cucurrentNode.next != null;
		}

		@Override
		public E next() {
			cucurrentNode = cucurrentNode.next;
			return cucurrentNode.o;
		}
	}
}
