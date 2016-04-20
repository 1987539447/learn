package com.siemen.adapter;

public class AdapterObj implements Targetable {

	private Source source = null;

	public AdapterObj(Source source) {
		this.source = source;
	}

	@Override
	public void method1() {
		source.method1();
	}

	@Override
	public void method2() {

		System.out.println("Targetable接口method2方法实现");

	}

}
