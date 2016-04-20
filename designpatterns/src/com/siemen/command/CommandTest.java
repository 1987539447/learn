package com.siemen.command;

public class CommandTest {

	public static void main(String[] args) {

		Receiver rec = new Receiver();
		Command command = new MyCommand(rec);
		Invoker invoker = new Invoker(command);

		invoker.aciton();

	}

}
