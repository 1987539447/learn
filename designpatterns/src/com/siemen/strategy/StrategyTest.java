package com.siemen.strategy;

public class StrategyTest {

	public static void main(String[] args) {

		String exp = "2+8";
		ICaculator caculator = new Plus();
		System.out.println("-------result -----" + caculator.caculate(exp));
		;

	}

}
