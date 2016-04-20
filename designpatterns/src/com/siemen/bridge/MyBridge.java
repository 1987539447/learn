package com.siemen.bridge;

public class MyBridge extends Bridge {

	/* (non-Javadoc)
	 * @see com.siemen.bridge.Bridge#method()
	 */
	@Override
	public void method() {
		getSource().method();
	}

}
