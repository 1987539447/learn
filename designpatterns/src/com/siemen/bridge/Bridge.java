package com.siemen.bridge;

public abstract class Bridge {

	private Sourceable source;

	/**
	 * @return the source
	 */
	public Sourceable getSource() {
		return source;
	}

	/**
	 * @param source the source to set
	 */
	public void setSource(Sourceable source) {
		this.source = source;
	}

	public void method() {
		source.method();
	};

}
