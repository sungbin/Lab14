package edu.handong.csee.java.lab14.prob2;

import java.util.Scanner;
public class In_exception {
	Scanner key = new Scanner(System.in);
	private int x;
	private int y;
	
	public In_exception(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public In_exception() {
		System.out.print("x: ");
		this.x = key.nextInt();
		System.out.print("y: ");
		this.y = key.nextInt();
	}
	public int devideXasY() throws ArithmeticException
	{
		return this.x / this.y;
	}


}
