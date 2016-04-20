package com.siemen.interpreter;

public class InterpretTest {

	public static void main(String[] args) {

		Content content = new Content(8, 2);
		Expression plus = new Plus();
		Expression minus = new Minus();

		System.out.println("plus----" + plus.interprete(content));
		System.out.println("minus----" + minus.interprete(content));

	}
}
