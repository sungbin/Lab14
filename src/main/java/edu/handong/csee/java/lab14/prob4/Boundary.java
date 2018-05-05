package edu.handong.csee.java.lab14.prob4;

import java.util.Scanner;
public class Boundary {
	private static int []array = new int [5];
	private static int count = 0;
	Scanner in = new Scanner(System.in);
	public void putArrayIndex() throws ArrayIndexOutOfBoundsException
	{
		int newint;
		System.out.print("Enter an integer: ");
		newint = in.nextInt();
		array[count]=newint;
		System.out.println("arr["+count+"] <- "+newint);
		count ++;
	}

}
