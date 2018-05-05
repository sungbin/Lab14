package edu.handong.csee.java.lab14.prob4;

public class Main {

	public static void main(String[] args) {
		Boundary bd = new Boundary();
		while(true)
		{
			try {
				bd.putArrayIndex();
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Invalid array index access!");
				break;
			}
			
		}

	}
	

}
