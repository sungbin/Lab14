package edu.handong.csee.java.lab14.prob5;

public class Myexception extends Exception {
	private String message = null;

	public Myexception() {
		super();
	}

	public Myexception(String message) {
		super(message);
		this.message = message;
	}

	public Myexception(Throwable cause) {
		super(cause);
	}

	@Override
	public String toString() {
		return message;
	}
	

}
