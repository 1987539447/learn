package com.siemen.strategy;

public class Multiply extends AbstractCaculator implements ICaculator {

	@Override
	public int caculate(String exp) {
		int arrayInt[] = split(exp, "\\*");
		return arrayInt[0] * arrayInt[1];
	}

}
