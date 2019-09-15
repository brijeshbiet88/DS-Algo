package com.interview.bitwise;

public class BitwiseTest {

	public static void main(String[] args) {
		int a = 20;
		int b = a >> 1;
		int c = 24;
		System.out.println(b);
		System.out.println(c&b);
		int checker = 12;
		System.out.println("1<<2 : "+(1 << 2));
		checker = checker | (1 << 2);
		System.out.println("Checker : "+checker);
		System.out.println(1<<5);
		System.out.println("Bit wise Test Negative Left Shift : "+(1<<-29));

	}

}
