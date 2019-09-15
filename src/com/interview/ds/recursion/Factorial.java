package com.interview.ds.recursion;

public class Factorial {

	public static void main(String[] args) {
		int n = 5;
		
		int fact = recFact(n , 1);
		System.out.println(fact);
	}

	private static int recFact(int n, int factorial) {
		if(n == 0)
			return factorial;
		return recFact(n -1 , factorial*n);
	}

}
