package com.siemen.templatemethod;

public class TemplateTest {

	public static void main(String[] args) {

		String exp = "10+9";
		AbstractCaculator caculator = new Plus();
		System.out
				.println("--------result---" + caculator.caculate(exp, "\\+"));
		;

	}

}
