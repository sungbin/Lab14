package edu.handong.csee.java.lab14.prob6; //the file is in this package

import java.util.Scanner; //include Scanner class
public class Main { //declare public type class
	

	public static void main(String[] args) { //declare main method
		Scanner in = new Scanner(System.in); //make instance of Scanner
		CustomID obj = new CustomID(); //make instance of CustomID
		String name, race; //declare String type two variables
		int age; //declare integer type variable
		boolean repeat= true; //declare boolean type variable, put true to that
		
		while(repeat) //if repaet equals true
		{
			try {//are there any exception?
				if(obj.getState() == 0) { //if state value equals 0
				System.out.print("Enter your name: "); //print sentence
				name = in.nextLine(); //scan one line, and put them to name
				obj.setName(name); //put name to obj's name
				}
			else if(obj.getState() == 1) { //if state value equals 1
				System.out.print("Enter your age: "); //print sentence
				age = in.nextInt(); //scan one line ,and put them to name
				in.nextLine(); //scan one line
				obj.setAge(age); //put age to obj's age
				}
			else if(obj.getState() == 2) { //if state value equals 2
				System.out.print("Enter your race: "); //print sentence
				race = in.nextLine(); //scan one line, and put them to race
				obj.setRace(race);// put race to obj's race
				}
			}
			catch(Exception e){ //is there Exception type exception?
				System.out.println(e.getMessage()+"Try again!"); //print sentence
				continue; //one skip, and keep going roof
			}
		}
	}

}
