package com.interview.stringarraymanipulation;

public class IntegerToRoman {

	public static void main(String[] args) {
		int num = 2444;
		String roman = generateRoman(num);
		System.out.println("Roman Represntaion is : "+roman);
	}
	
	private static String generateRoman(int num) {
		StringBuilder sb = new StringBuilder();
		while(num != 0) {
			int mod = 0;
			if(num >= 1000) {
				mod = num % 1000;
				num /= 1000;
				
				if(num == 1)
					sb.append("M");
				else if(num == 2)
					sb.append("MM");
				else
					sb.append("MMM");
				num = mod;
			}
			
			else if(num >= 900) {
				mod = num % 900;
				num /= 900;
				if(num == 1)
					sb.append("CM");
				num = mod;
				
			}
			
			else if(num >= 500) {
				mod = num % 500;
				num /= 500;
				if(num == 1)
					sb.append("D");
				num = mod;
			}
				
			else if(num >= 100) {
				mod = num % 100;
				num /= 100;
				if(num == 1)
					sb.append("C");
				else if(num == 2)
					sb.append("CC");
				else if(num == 3)
					sb.append("CCC");
				else if(num == 4)
					sb.append("CD");
				num = mod;
			}
			
			else if(num >= 90) {
				mod = num % 90;
				num /= 90;
				if(num == 1)
					sb.append("XC");
				num = mod;
				
			}
			
			
			else if(num >= 50) {
				mod = num % 50;
				num /= 50;
				if(num == 1)
					sb.append("L");
				num = mod;
			}
			
			else if(num >= 10) {
				mod = num % 10;
				num /= 10;
				if(num == 1)
					sb.append("X");
				else if(num == 2)
					sb.append("XX");
				else if(num == 3)
					sb.append("XXX");
				else if(num == 4)
					sb.append("XL");
				num = mod;
			}
			
			else if(num >= 9) {
				mod = num % 9;
				num /= 9;
				if(num == 1)
					sb.append("IX");
				num = mod;
				
			}
			
			else if(num >= 5) {
				mod = num % 5;
				num /= 5;
				if(num == 1)
					sb.append("V");
				num = mod;
			}
			
			else if (num >= 1) {
				mod = num % 10;

				if (num == 1)
					sb.append("I");
				else if (num == 2)
					sb.append("II");
				else if (num == 3)
					sb.append("III");
				else if (num == 4)
					sb.append("IV");
				num /= 10;
			}
	
		}
		
		return sb.toString();
	}
}
