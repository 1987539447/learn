package com.siemen.factorymethod;

public class FactoryTest {

	public static void main(String[] args) {

		/*
		 * 单一方法
		SenderFactory sf = new SenderFactory();
		Sender sms = sf.produce("sms");
		sms.send();
		Sender mail = sf.produce("mail");
		mail.send();
		*/

		/*// 多方法模式--非静态方法
		SenderFactory sf = new SenderFactory();
		Sender sms = sf.produceSms();
		sms.send();
		Sender mail = sf.produceMail();
		mail.send();*/

		// 多方法模式--静态方法
		Sender sms = SenderFactory.produceSms();
		sms.send();
		Sender mail = SenderFactory.produceMail();
		mail.send();

	}

}
