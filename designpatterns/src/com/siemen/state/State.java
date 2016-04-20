package com.siemen.state;

public class State {

	private String state;

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	public void ONmethod() {
		System.out.println("execute ONmethod-------");
	}

	public void OFFmethod() {
		System.out.println("execute OFFmethod-------");
	}
}
