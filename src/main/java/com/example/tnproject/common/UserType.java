package com.example.tnproject.common;

public enum UserType {
	
	GUEST(1), STUDENT(2), COACH(3), ADMIN(4);

	private final int value;

	private UserType(int value) {
		this.value = value;
	}
	
	public int getUserType() {
		return this.value;
	}

}
