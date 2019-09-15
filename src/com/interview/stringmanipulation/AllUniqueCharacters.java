package com.interview.stringmanipulation;

import java.util.Arrays;

public class AllUniqueCharacters {

	public static void main(String[] args) {
		String str = "fBedta";
	//	str = str.toLowerCase();
		boolean isUniqueChar = isUniqueChars(str);
		System.out.println("Bitwise Method : "+isUniqueChar);
		
		//boolean isUniqueChar2 = isUniqueChars2(str);
		//System.out.println("Sort Method : "+isUniqueChar2);

	}
	
	private static boolean isUniqueChars2(String str) {
		
		char [] chars = str.toCharArray();
		Arrays.sort(chars);
		
		for(int i = 0 ; i < chars.length-1 ; i++) {
			if(chars[i] == chars[i+1])
				return false;
		}
		
		return true;
	}

	public static boolean isUniqueChars(String str) {
	    int checker = 0;
	    for (int i = 0; i < str.length(); ++i) {
	        int val = str.charAt(i) - 'a';
	        if ((checker & (1 << val)) > 0) return false;
	        checker =  checker |(1 << val);
	        System.out.println(checker);
	    }
	    return true;
	}

}
