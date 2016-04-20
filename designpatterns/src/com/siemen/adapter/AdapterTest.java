package com.siemen.adapter;

public class AdapterTest {

	public static void main(String[] args) {

		/*Targetable adapter = new Adapter();
		adapter.method1();
		adapter.method2();*/

		/*		Source source = new Source();
				Targetable adapter = new AdapterObj(source);
				adapter.method1();
				adapter.method2();*/

		Sourceable targeta = new SourceSubA();
		Sourceable targetb = new SourceSubB();
		targeta.method1();
		targeta.method2();
		targetb.method1();
		targetb.method2();

	}

}
