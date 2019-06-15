package com.example.tnproject.common;

public enum Status {

	ACTIVE(1), INACTIVE(2);

	private final int value;

	private Status(int value) {
		this.value = value;
	}
	
	public int getUserType() {
		return this.value;
	}
}
