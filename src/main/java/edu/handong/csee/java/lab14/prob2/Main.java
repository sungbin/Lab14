package edu.handong.csee.java.lab14.prob2;

import java.util.InputMismatchException;

public class Main {

	public static void main(String[] args) {
		try {
			In_exception ie = new In_exception();
			System.out.println(ie.devideXasY());
		}catch(InputMismatchException e)
		{
			System.out.println(e.toString());
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.toString());
		}

	}

}
