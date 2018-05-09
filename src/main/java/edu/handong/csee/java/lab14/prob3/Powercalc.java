package edu.handong.csee.java.lab14.prob3; //the file is in this package

public class Powercalc { //declare public type class
	public long power(int n, int p) throws Exception //declare public type method, return type is long, parameter type is int, int. if there is Exception type Exception, throws them
	{
		int m=1; //declare local variable, integer type
		if(n ==0&& p == 0) //if n equal zero and p equal zero
			throw new Exception("n and p should not be zero"); //make new Exception type Exception, named that
		if(n<0 || p<0) //if n is smaller than zero and p is smaller then zero
			throw new Exception("n or p should not be negative");//make new Exception type Exception, named that
		for(int i =0; i<p; i++) //roof while i is smaller than p
			m*=n; //put n*m value to m
		return m; //return m value
	}

}
