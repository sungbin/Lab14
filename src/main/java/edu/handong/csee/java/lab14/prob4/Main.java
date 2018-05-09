package edu.handong.csee.java.lab14.prob4; //the file is in this package

public class Main { //declare public type class

	public static void main(String[] args) { //declare public type, main method
		Boundary bd = new Boundary(); //make instance of boundary class
		while(true) //roof infinity
		{
			try { //if there are any exception?
				bd.putArrayIndex(); //execute putArrayIndex
			} catch (ArrayIndexOutOfBoundsException e) { //if there is ArrayIndexOutOfBoundsException,
				System.out.println("Invalid array index access!"); //print sentence
				break; //escape roof
			}
			
		}

	}
	

}
