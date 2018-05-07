package edu.handong.csee.java.lab14.prob6;

import java.util.Scanner;
public class Main {
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		CustomID obj = new CustomID();
		String name, race;
		int age;
		boolean repeat= true;
		
		while(repeat)
		{
			try {
				if(obj.getState() == 0) {
				System.out.print("Enter your name: ");
				name = in.nextLine();
				obj.setName(name);
				}
			else if(obj.getState() == 1) {
				System.out.print("Enter your age: ");
				age = in.nextInt();
				in.nextLine();
				obj.setAge(age);
				}
			else if(obj.getState() == 2) {
				System.out.print("Enter your race: ");
				race = in.nextLine();
				obj.setRace(race);
				}
			}
			catch(Exception e){
				System.out.println(e.getMessage()+"Try again!");
				continue;
			}
		}
	}

}
