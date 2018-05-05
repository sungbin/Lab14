package edu.handong.csee.java.lab14.prob3;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Powercalc my_calculator = new Powercalc();
	    Scanner key = new Scanner(System.in);
		int n,p;
		while(key.hasNext())
		{
			n = key.nextInt();
			p = key.nextInt();
			try {
				System.out.println(my_calculator.power(n, p));
			} catch(Exception e) {
				System.out.println(e);
			}
		}
	}

}
