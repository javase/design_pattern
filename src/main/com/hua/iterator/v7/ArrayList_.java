package com.hua.iterator.v7;


/**
 * 相比数组，这个容器不用考虑边界问题，可以动态扩展
 */
class ArrayList_<E> implements Collection_<E> {
	E[] objects = (E[]) new Object[10];

	//objects中下一个空的位置在哪儿,或者说，目前容器中有多少个元素
	private int index = 0;

	@Override
	public void add(E o) {
		if (index == objects.length) {
			E[] newObjects = (E[]) new Object[objects.length * 2];
			System.arraycopy(objects, 0, newObjects, 0, objects.length);
			objects = newObjects;
		}

		objects[index] = o;
		index++;
	}

	@Override
	public int size() {
		return index;
	}

	/**
	 * 会在客户端请求迭代器时返回一个特定的具体迭代器类实体。
	 * @return
	 */
	@Override
	public Iterator_<E> iterator() {
		return new ArrayListIterator();
	}

	/**
	 * 具体迭代器 （Concrete Iterators） 实现遍历集合的一种特定算法。 迭代器对象必须跟踪自身遍历的进度。 这使得多个迭代器可以相互独立地遍历同一集合。
	 * @param <E>
	 */
	private class ArrayListIterator<E> implements Iterator_<E> {

		private int currentIndex = 0;

		@Override
		public boolean hasNext() {
			if (currentIndex >= index) {
				return false;
			}
			return true;
		}

		@Override
		public E next() {
			E o = (E) objects[currentIndex];
			currentIndex++;
			return o;
		}
	}

}