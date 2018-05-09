package edu.handong.csee.java.lab14.prob5; //the file is in this package

import java.util.Scanner; //include Scanner class
public class Main { //declare public type class

	public static void main(String[] args) { //declare main method
		
		try { //are there any exception?
			myTest(); //execute myTest()
		} catch (Myexception e) { //if there is Myexception
			System.out.println("Inside catch block: " + e); //print sentence
		}
		
	}
	
	public static void myTest() throws Myexception //declre public static type method, return nothing, throws Myexception type Exception
	{
		String str; //declare String type variable
		Scanner in = new Scanner(System.in); //make instance of Scanner
		str = in.nextLine(); //scan one Line from user
		
		if (str.equals("null")) //if str is equals "null"
		{
			throw new Myexception("String val is null"); //make new exception named "String val is null"
		}
		System.out.println("String val is " + str); //print sentence
		
	}

}
