package com.siemen.memento;

public class Original {

	private String value;

	public Original(String value) {
		this.value = value;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

	public Memento createMemento() {
		return new Memento(this.value);
	}

	public void restoreMemento(Memento memento) {

		this.value = memento.getValue();

	}

}
