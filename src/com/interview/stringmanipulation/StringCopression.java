package com.interview.stringmanipulation;

public class StringCopression {

	public static void main(String[] args) {
		String str = "aaaaaabbbcttzbbbppppBBB";
		System.out.println("Compressed String 1 : "+compress(str));
		System.out.println("Compressed String 2 : "+compressString(str));
	}

	private static String compress(String str) {
		StringBuilder compressedSb = new StringBuilder();
		int count = 1;
		int i = 0;
		for(; i < str.length()-1 ; i++) {
			if(str.charAt(i) == str.charAt(i+1)) {
				count++;
			}else {
				compressedSb.append(str.charAt(i));
				compressedSb.append(count);
				count = 1;
			}
			
		}
		compressedSb.append(str.charAt(i));
		compressedSb.append(count);
		return compressedSb.toString();
		
	}
	
	public static String compressString(String str) {
		StringBuilder compressed = new StringBuilder();
		int countConsecutive = 0;
		for (int i = 0; i < str.length(); i++) {
			countConsecutive++;
			
			/* If next character is different than current, append this char to result.*/
			if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
				compressed.append(str.charAt(i));
				compressed.append(countConsecutive);
				countConsecutive = 0;
			}
		}
		return compressed.length() < str.length() ? compressed.toString() : str;
	}

}
