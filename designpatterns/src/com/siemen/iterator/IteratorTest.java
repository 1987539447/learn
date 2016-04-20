package com.siemen.iterator;

public class IteratorTest {

	public static void main(String[] args) {

		Collection coll = new MyCollection();
		Iterator it = coll.iterator();
		while (it.hasNext()) {
			System.out.println("---" + it.next());
		}

	}

}
