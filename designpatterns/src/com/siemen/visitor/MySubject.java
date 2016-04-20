package com.siemen.visitor;

public class MySubject implements Subject {

	@Override
	public void accept(Visitor visitor) {
		System.out.println("accept the visitor,then invoke the visitor method");
		visitor.visit(this);
	}

	@Override
	public String getSubject() {
		return "hello";
	}

}
