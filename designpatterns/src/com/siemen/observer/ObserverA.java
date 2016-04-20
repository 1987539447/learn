package com.siemen.observer;

public class ObserverA implements Observer {

	@Override
	public void update(String msg) {
		System.out.println("ObserverA get msg~~" + msg);
	}

}
