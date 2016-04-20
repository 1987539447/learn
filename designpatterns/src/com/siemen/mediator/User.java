package com.siemen.mediator;

public abstract class User {

	private Mediator mediator;

	/**
	 * @return the mediator
	 */
	public Mediator getMediator() {
		return mediator;
	}

	public User(Mediator mediator) {
		this.mediator = mediator;
	}

	public abstract void work();
}
