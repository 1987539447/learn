package com.siemen.decorator;

public class Decorator implements Sourceable {

	private Sourceable source = null;

	public Decorator(Sourceable source) {
		this.source = source;
	}

	@Override
	public void method() {

		System.out.println("befor source decorator");
		source.method();
		System.out.println("after source decorator");

	}

}
