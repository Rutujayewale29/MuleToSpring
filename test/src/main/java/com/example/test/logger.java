package com.example.test;
public class logger {
	private String level;
	private String message;
	public logger() {
		super();
		// TODO Auto-generated constructor stub	
	}
	
	public logger(String level, String message) {
		super();
		this.level = level;
		this.message = message;
	}

	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "logger [level=" + level + ", message=" + message + "]";
	}
	
}
