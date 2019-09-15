package com.interview.stringmanipulation;

public class StringCopression {

	public static void main(String[] args) {
		String str = "aaaaaabbbcttzbbbppppBBB";
		System.out.println("Compressed String : "+compress(str));
	}

	private static String compress(String str) {
		StringBuilder compressedSb = new StringBuilder();
		int count = 1;
		int i = 0;
		for(; i < str.length()-1 ; i++) {
			if(str.charAt(i) == str.charAt(i+1)) {
				count++;
			}else {
				compressedSb.append(count);
				compressedSb.append(str.charAt(i));
				count = 1;
			}
			
		}
		compressedSb.append(count);
		compressedSb.append(str.charAt(i));
		return compressedSb.toString();
		
	}

}
