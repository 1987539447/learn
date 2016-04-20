package com.siemen.builder;

import java.util.ArrayList;
import java.util.List;

import com.siemen.factorymethod.MailSender;
import com.siemen.factorymethod.Sender;
import com.siemen.factorymethod.SmsSender;

public class Builder {

	private List<Sender> list = new ArrayList<Sender>();

	public void produceSmsSender(int count) {
		for (int i = 0; i < count; i++) {
			list.add(new SmsSender());
		}
	}

	public void produceMailSender(int count) {
		for (int i = 0; i < count; i++) {
			list.add(new MailSender());
		}
	}
}
