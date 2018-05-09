package edu.handong.csee.java.lab14.prob1; //the file is in this package

import java.util.Scanner; //import Scanner class
import java.util.Random; //include Random class
public class SpeedLimitter { //declare public type SpeedLimitter class
	Scanner key = new Scanner(System.in); //make instance of Scanner
	Random rand = new Random(); // make instance of Random
	private int speed = 0; //declare private integer type speed variable
	private int limit = 0; //declare private integer type limit variable
	public SpeedLimitter(int limit, int speed) //declare constructor, parameter type are int, int
	{
		this.limit = limit; //put local limit variable to member limit variable
		this.speed = speed; //put local speed variable to member speed variable
	}
	public SpeedLimitter()// declare constructor
	{
		System.out.print("Set the speed limit, officer: "); //print sentence
		this.limit = key.nextInt(); //scan one integer
		this.speed = rand.nextInt(101); //put random integer within 100
	}
	
	public void warnSpeedLimit() //declare public type method, return nothing
	{
		try { //is there exception?
			if(this.speed > this.limit) //if speed is bigger than limit
			{
				throw new Exception("Speed Limit " + this.limit + "km exceeded!"); //make new exception
			}
			System.out.println("You are a Law abiding citizen!"); //print sentence
		}catch(Exception e) { //if there is Exception type exception?
			System.out.println(e.getMessage()); //print sentence
			System.out.println("You are being fined. "); //print sentence
		}
	}
	public void printSpeed() //declare public type method, return nothing
	{
		System.out.println("Your current speed: " + this.speed); //print sentence
	}

}
