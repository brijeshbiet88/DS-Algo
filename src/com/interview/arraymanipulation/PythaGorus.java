package com.interview.arraymanipulation;

public class PythaGorus {

	public static void main(String[] args) {
		int n = 25;
		printPythaGorus(n);

	}

	private static void printPythaGorus(int n) {
		for(int a = 1 ; a < n ; a++) {
			for(int b = 1 ; b < n ; b++) {
				int c = (int) Math.pow(a*a + b*b, 1.0/2.0);
				if(c*c == (a*a + b*b))
					System.out.println("a : "+a+" b : "+b+" c : "+c);
			}
		}
		
	}

}
