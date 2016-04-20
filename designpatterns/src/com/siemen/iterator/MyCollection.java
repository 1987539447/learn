package com.siemen.iterator;

public class MyCollection implements Collection {

	String[] content = { "A", "B", "C", "D", "E", "F" };

	@Override
	public Iterator iterator() {
		return new MyIterator(this);
	}

	@Override
	public Object get(int index) {
		return content[index];
	}

	@Override
	public int size() {
		return content.length;
	}

}
