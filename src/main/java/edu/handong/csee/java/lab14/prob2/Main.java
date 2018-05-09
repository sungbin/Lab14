package edu.handong.csee.java.lab14.prob2; //the file is in this package

import java.util.InputMismatchException; //include InputMismatchException class

public class Main { //declare Main class

	public static void main(String[] args) { //declare main method
		try { //is there any exception?
			In_exception ie = new In_exception();// make instance of In_exception
			System.out.println(ie.devideXasY()); //print sentence
		}catch(InputMismatchException e) //if InputMismatchException type Exception appear
		{
			System.out.println(e.toString()); //print sentence
		}
		catch(ArithmeticException e) //if ArithmeticException type Exception appear
		{
			System.out.println(e.toString()); //print sentence
		}

	}

}
