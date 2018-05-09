package edu.handong.csee.java.lab14.prob5; //the file is in this package

public class Myexception extends Exception { //declare public type class, child of Exception class
	private String message = null; //declare private String type variable

	public Myexception() { //make constructor
		super(); //execute parent constructor
	}

	public Myexception(String message) { //make constructor, parameter type is String
		super(message);//execute parent constructor
		this.message = message; //put local message value to member message
	}

	public Myexception(Throwable cause) { //make constructor, parameter type is Throwable
		super(cause); ////execute parent constructor
	}

	@Override
	public String toString() { //make overriding method, return type is String
		return message; //return message
	}
	

}
