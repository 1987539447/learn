package com.siemen.mediator;

public class UserA extends User {

	public UserA(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void work() {

		System.out.println("UserA working~~~~");

	}

}
