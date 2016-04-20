package com.siemen.state;

public class Content {

	private State state;

	public Content(State state) {
		this.state = state;
	}

	public void method() {
		if ("ON".equals(state.getState())) {
			state.ONmethod();
		} else if ("OFF".equals(state.getState())) {
			state.OFFmethod();
		}
	}
}
