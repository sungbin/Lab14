package edu.handong.csee.java.lab14.prob5;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		try {
			myTest();
		} catch (Myexception e) {
			System.out.println("Inside catch block: " + e);
		}
		
	}
	
	public static void myTest() throws Myexception
	{
		String str;
		Scanner in = new Scanner(System.in);
		str = in.nextLine();
		
		if (str.equals("null"))
		{
			throw new Myexception("String val is null");
		}
		System.out.println("String val is " + str);
		
	}

}
