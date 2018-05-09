package edu.handong.csee.java.lab14.prob4; //the file is in this package

import java.util.Scanner; //include Scanner class
public class Boundary { //declare public type class
	private static int []array = new int [5]; //declare private static integer array variable
	private static int count = 0; //declare private static integer variable
	Scanner in = new Scanner(System.in); //make instance of scanner
	public void putArrayIndex() throws ArrayIndexOutOfBoundsException //declare public type, return nothing
	{
		int newint; //declare integer type variable
		System.out.print("Enter an integer: "); //print sentence
		newint = in.nextInt(); //scan one integer
		array[count]=newint; //put newint to array[count]
		System.out.println("arr["+count+"] <- "+newint); //print sentence
		count ++; //count plus 1
	}

}
