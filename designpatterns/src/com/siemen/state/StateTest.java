package com.siemen.state;

public class StateTest {

	public static void main(String[] args) {

		State state = new State();
		Content content = new Content(state);

		state.setState("ON");
		content.method();

		state.setState("OFF");
		content.method();

	}

}
