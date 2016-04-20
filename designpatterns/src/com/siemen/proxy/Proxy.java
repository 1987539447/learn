package com.siemen.proxy;

public class Proxy implements Sourceable {

	private Sourceable source = null;

	public Proxy() {
		this.source = new Source();
	}

	@Override
	public void method() {

		before();
		source.method();
		after();

	}

	private void after() {
		System.out.println("after proxy");

	}

	private void before() {
		System.out.println("befor proxy");

	}

}
