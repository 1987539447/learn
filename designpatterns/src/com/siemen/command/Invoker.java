package com.siemen.command;

public class Invoker {

	private Command command;

	public Invoker(Command command) {
		this.command = command;
	}

	public void aciton() {
		System.out.println("send a command~~");
		command.exe();
	}
}
