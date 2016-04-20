package com.siemen.memento;

public class Storage {

	private Memento memento;

	public Storage(Memento memento) {
		this.memento = memento;

	}

	/**
	 * @return the memento
	 */
	public Memento getMemento() {
		return memento;
	}

	/**
	 * @param memento the memento to set
	 */
	public void setMemento(Memento memento) {
		this.memento = memento;
	}

}
