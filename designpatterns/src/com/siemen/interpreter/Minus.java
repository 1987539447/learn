package com.siemen.interpreter;

public class Minus implements Expression {

	@Override
	public int interprete(Content content) {

		return content.getNumA() - content.getNumB();
	}

}
