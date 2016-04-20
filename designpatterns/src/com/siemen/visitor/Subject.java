package com.siemen.visitor;

public interface Subject {

	public void accept(Visitor vistor);

	public String getSubject();

}
