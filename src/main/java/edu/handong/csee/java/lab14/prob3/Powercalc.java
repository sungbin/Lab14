package edu.handong.csee.java.lab14.prob3;

public class Powercalc {
	public long power(int n, int p) throws Exception
	{
		int m=1;
		if(n ==0&& p == 0)
			throw new Exception("n and p should not be zero");
		if(n<0 || p<0)
			throw new Exception("n or p should not be negative");
		for(int i =0; i<p; i++)
			m*=n;
		return m;
	}

}
