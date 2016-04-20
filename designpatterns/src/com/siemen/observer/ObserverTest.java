package com.siemen.observer;

public class ObserverTest {

	public static void main(String[] args) {

		Subject my = new MySubject();
		my.add(new ObserverA());
		my.add(new ObserverB());

		my.operator();

	}

}
