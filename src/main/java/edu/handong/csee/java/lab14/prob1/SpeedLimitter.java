package edu.handong.csee.java.lab14.prob1;

import java.util.Scanner;
import java.util.Random;
public class SpeedLimitter {
	Scanner key = new Scanner(System.in);
	Random rand = new Random();
	private int speed = 0;
	private int limit = 0;
	public SpeedLimitter(int limit, int speed)
	{
		this.limit = limit;
		this.speed = speed;
	}
	public SpeedLimitter()
	{
		System.out.print("Set the speed limit, officer: ");
		this.limit = key.nextInt();
		this.speed = rand.nextInt(101);
	}
	
	public void warnSpeedLimit()
	{
		try {
			if(this.speed > this.limit)
			{
				throw new Exception("Speed Limit " + this.limit + "km exceeded!");
			}
			System.out.println("You are a Law abiding citizen!");
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("You are being fined. ");
		}
	}
	public void printSpeed()
	{
		System.out.println("Your current speed: " + this.speed);
	}

}
