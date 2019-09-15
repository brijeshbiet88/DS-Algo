package com.interview.stringmanipulation;

public class PermutationOfPalindrome {
	/* Toggle the ith bit in the integer. */
	public static int toggle(int bitVector, int index) {
		if (index < 0) return bitVector;
		
		int mask = 1 << index;
		
		
		if ((bitVector & mask) == 0) { // If character is occuring odd time then it will be true
			bitVector = bitVector | mask; // so add that in bitvector
		} else {                      // If character is coming even time
			bitVector = bitVector & ~mask; // So that the corresponding bit will be unset
		}
		return bitVector;
	}
	
	/* Create bit vector for string. For each letter with value i,
	 * toggle the ith bit. */
	public static int createBitVector(String phrase) {
		int bitVector = 0;
		for (char c : phrase.toCharArray()) {
			int x = Common.getCharNumber(c); // Gives Number to Character irrespective of small or caps
			bitVector = toggle(bitVector, x);
		}
		return bitVector;
	}
	
	/* Check that at most one bit is set by subtracting one from the 
	 * integer and ANDing it with the original integer. */
	public static boolean checkAtMostOneBitSet(int bitVector) {
		return (bitVector & (bitVector - 1)) == 0; // If there is only one bit set it will be 0 othersise non zero
	}
	
	public static boolean isPermutationOfPalindrome(String phrase) {
		int bitVector = createBitVector(phrase);
		return checkAtMostOneBitSet(bitVector);
	}
	
	public static void main(String[] args) {
		String pali = "ba c ba";
		System.out.println(isPermutationOfPalindrome(pali));
	}
}