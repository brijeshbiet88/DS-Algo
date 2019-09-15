package com.interview.stringmanipulation;

public class IsPermutationPalindrome {
	public static boolean checkMaxOneOdd(int[] table) {
		boolean foundOdd = false;
		for (int count : table) {
			if (count % 2 == 1) { // only one character will be odd for that we are having foundOdd
				if (foundOdd) {
					return false;
				}
				foundOdd = true;
			}
		}
		return true;
	}

	public static boolean isPermutationOfPalindrome(String phrase) {
		int[] table = Common.buildCharFrequencyTable(phrase);
		return checkMaxOneOdd(table);
	}

	public static void main(String[] args) {
		String pali = "Rats live on a no evil star";
		System.out.println(isPermutationOfPalindrome(pali));
	}

}