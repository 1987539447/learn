package com.siemen.observer;

public class MySubject extends AbstractSubject {

	@Override
	public void operator() {

		System.out.println("更新自身属性数据~~");
		notifyObservers();

	}

}
