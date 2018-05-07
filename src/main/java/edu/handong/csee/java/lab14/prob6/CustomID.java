package edu.handong.csee.java.lab14.prob6;

public class CustomID extends Exception {
	private String name="";
	private int age;
	private String race="";
	private int state = 0;
	String str;


	public void setName(String name) throws Exception {
		if(name.length() <5)
			throw new Exception("Your name is short! ");
		System.out.println("Name is valid");
		this.name = name;
		System.out.println("Name: " +this.name);
		state =1;
	}

	public void setAge(int age) throws Exception {
		if(age <18)
			throw new Exception("You are too young! ");
		System.out.println("Age is valid");
		this.age = age;
		System.out.println("Age: " +this.age);
		state = 2;
	}

	public void setRace(String race) throws Exception {
		if(race.equals("Vulcans")||race.equals("Romulan")||race.equals("Klingons"))
		{
			System.out.println("Race is valid");
			this.race = race;
			System.out.println("Race: " +this.race);
			state =0;
			return;
		}
		throw new Exception("Human! ");
	}

	public int getState() {
		return state;
	}
	
	

}
