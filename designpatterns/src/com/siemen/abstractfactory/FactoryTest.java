package com.siemen.abstractfactory;

public class FactoryTest {

	public static void main(String[] args) {

		Provider sf = new SmsFactory();
		Sender sender = sf.produce();
		sender.send();

	}

}
