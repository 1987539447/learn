package com.siemen.factorymethod;

public class SenderFactory {

	/*
	 * 通过字符串判断创建哪种实例，容易出错
	 * 	public Sender produce(String type) {
			if ("mail".equals(type)) {
				return new MailSender();
			} else if ("sms".equals(type)) {
				return new SmsSender();
			} else {
				System.out.println("请输入正确的类型");
				return null;
			}
		}
		
		*/

	/*
	 * 	// 采用多方法模式 -非静态
		public Sender produceSms() {
			return new SmsSender();
		}

		public Sender produceMail() {
			return new MailSender();
		}*/

	// 采用多方法模式 -静态方法
	public static Sender produceSms() {
		return new SmsSender();
	}

	public static Sender produceMail() {
		return new MailSender();
	}

}
