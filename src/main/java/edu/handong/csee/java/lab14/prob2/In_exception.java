package edu.handong.csee.java.lab14.prob2; //the file is in this package

import java.util.Scanner; //include Scanner class
public class In_exception { //declare public type class
	Scanner key = new Scanner(System.in); //make instance of Scanner
	private int x; //declare private integer type
	private int y; //declare private integer type
	
	public In_exception(int x, int y) { //make constructor, parameter type are int, int
		this.x = x; //put x to member variable x
		this.y = y; //put y to member variable y
	}
	public In_exception() { //make constructor
		System.out.print("x: "); //print sentence
		this.x = key.nextInt(); //scan one integer
		System.out.print("y: "); //print sentence
		this.y = key.nextInt(); //scan on integer
	}
	public int devideXasY() throws ArithmeticException //declare public type, return type is integer
	{
		return this.x / this.y; //return value of x/y
	}


}
