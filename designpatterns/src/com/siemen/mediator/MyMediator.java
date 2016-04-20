package com.siemen.mediator;

public class MyMediator implements Mediator {

	private User usera;
	private User userb;

	/* (non-Javadoc)
	 * @see com.siemen.mediator.Mediator#createMediator()
	 */
	@Override
	public void createMediator() {

		usera = new UserA(this);
		userb = new UserB(this);

	}

	@Override
	public void workAll() {

		usera.work();
		userb.work();

	}

}
