package com.siemen.observer;

import java.util.Enumeration;
import java.util.Vector;

public abstract class AbstractSubject implements Subject {

	private Vector<Observer> vec = new Vector<Observer>();

	@Override
	public void add(Observer observer) {

		vec.add(observer);

	}

	@Override
	public void del(Observer observer) {

		vec.remove(observer);

	}

	@Override
	public void notifyObservers() {
		Enumeration<Observer> elements = vec.elements();
		while (elements.hasMoreElements()) {

			elements.nextElement().update("changed!!");
		}

	}

}
