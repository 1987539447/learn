package com.siemen.observer;

public class ObserverB implements Observer {

	@Override
	public void update(String msg) {
		System.out.println("ObserverB get msg~~" + msg);
	}

}
