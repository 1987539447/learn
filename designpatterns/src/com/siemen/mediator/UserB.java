package com.siemen.mediator;

public class UserB extends User {

	public UserB(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void work() {

		System.out.println("UserB working~~~~");

	}

}
