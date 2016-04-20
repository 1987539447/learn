package com.siemen.templatemethod;

public abstract class AbstractCaculator {

	public final int caculate(String exp, String opt) {
		int[] array = split(exp, opt);
		return caculate(array[0], array[1]);
	}

	abstract public int caculate(int num1, int num2);

	public int[] split(String exp, String opt) {
		int[] result = new int[2];
		String[] tempArr = exp.split(opt);
		result[0] = Integer.parseInt(tempArr[0]);
		result[1] = Integer.parseInt(tempArr[1]);
		return result;
	}

}
