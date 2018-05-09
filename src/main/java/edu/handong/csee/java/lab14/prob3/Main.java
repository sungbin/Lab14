package edu.handong.csee.java.lab14.prob3; //the file is in this package

import java.util.Scanner; //include Scanner class
public class Main { //declare Main class

	public static void main(String[] args) { //declare main method
		Powercalc my_calculator = new Powercalc(); //make instance Powercalc
	    Scanner key = new Scanner(System.in); //make instance of Scanner
		int n,p; //declare integer type two variable
		while(true) //infinity roop
		{
			n = key.nextInt(); //scan one integer
			p = key.nextInt(); //scan one integer
			try { //is there any exception?
				System.out.println(my_calculator.power(n, p)); //print sentence
			} catch(Exception e) { //if there is exception
				System.out.println(e); //print sentence of e's toString
			}
		}
	}

}
