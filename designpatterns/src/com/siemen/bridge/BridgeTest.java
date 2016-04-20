package com.siemen.bridge;

public class BridgeTest {

	public static void main(String[] args) {

		Sourceable sourceA = new SourceSubA();
		Sourceable sourceB = new SourceSubB();

		MyBridge bridge = new MyBridge();
		bridge.setSource(sourceA);
		bridge.method();

		bridge.setSource(sourceB);
		bridge.method();

	}

}
