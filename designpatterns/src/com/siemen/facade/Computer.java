package com.siemen.facade;

public class Computer {

	private CPU cpu;
	private Memory memory;
	private Disk disk;

	public Computer() {
		this.cpu = new CPU();
		this.memory = new Memory();
		this.disk = new Disk();
	}

	public void startup() {
		System.out.println("Computer start up begain~~");
		cpu.startup();
		memory.startup();
		disk.startup();
		System.out.println("Computer started");

	}

	public void shutdown() {
		System.out.println("Computer shutdown begain~~");
		memory.shutdown();
		disk.shutdown();
		cpu.shutdown();

		System.out.println("Computer shutdown");
	}
}
