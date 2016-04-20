package com.siemen.iterator;

public class MyIterator implements Iterator {

	private Collection collection;
	private int pos = -1;

	public MyIterator(Collection coll) {
		collection = coll;
	}

	@Override
	public Object previous() {
		if (pos > 0) {
			pos--;
		}
		return collection.get(pos);
	}

	@Override
	public Object next() {
		if (pos < collection.size() - 1) {
			pos++;
		}
		return collection.get(pos);
	}

	@Override
	public boolean hasNext() {
		if (pos < collection.size() - 1) {
			return true;
		}
		return false;
	}

	@Override
	public Object first() {
		return collection.get(0);
	}

	@Override
	public Object last() {
		return collection.get(collection.size() - 1);
	}

}
