package com.siemen.memento;

public class MementoTest {

	public static void main(String[] args) {

		Original org = new Original("hello");

		Storage storage = new Storage(org.createMemento());
		System.out.println("初始化状态~~" + org.getValue());
		org.setValue("world");
		System.out.println("修改后状态~~" + org.getValue());

		org.restoreMemento(storage.getMemento());

		System.out.println("恢复后状态~~" + org.getValue());

	}

}
