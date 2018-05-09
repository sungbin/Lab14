package edu.handong.csee.java.lab14.prob6; //the file is in this package

public class CustomID extends Exception { //declare public class, child of Exception
	private String name=""; //declare type private String variable
	private int age; //declare private integer type variable
	private String race=""; //declare private String type variable
	private int state = 0; //declare private integer type variable
	String str; //declare String type variable


	public void setName(String name) throws Exception { //declare public type, return nothing, parameter type is String, throws Exception type Exception
		if(name.length() <5) //if name.length() is smaller than 5
			throw new Exception("Your name is short! "); //make new Exception named that, and throw
		System.out.println("Name is valid"); //print sentence
		this.name = name; //put local name value to member name variable
		System.out.println("Name: " +this.name); //print sentence
		state =1; //put 1 to state
	}

	public void setAge(int age) throws Exception { //declare public type, return nothing, parameter type is integer, throws Exception type Exception
		if(age <18) //if age is smaller than 18
			throw new Exception("You are too young! "); //make new Exception named that
		System.out.println("Age is valid"); //print sentence
		this.age = age; //put local age value to member age variable
		System.out.println("Age: " +this.age); //print sentence
		state = 2; //put 2 to state
	}

	public void setRace(String race) throws Exception { //make public type, return nothing, parameter type is String, throws Exception type exception
		if(race.equals("Vulcans")||race.equals("Romulan")||race.equals("Klingons")) //if race equals Vulcans or Romulan, or Klingons
		{
			System.out.println("Race is valid"); //print sentence
			this.race = race; //put local race value to member race variable
			System.out.println("Race: " +this.race); //print sentence
			state =0; //put zero to state
			return; //exit this method
		}
		throw new Exception("Human! "); //make new Exception named that
	}

	public int getState() { //make public type method, return type is integer
		return state; //return state value
	}
	
	

}
