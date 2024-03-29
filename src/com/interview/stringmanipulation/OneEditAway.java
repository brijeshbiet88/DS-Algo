package com.interview.stringmanipulation;

public class OneEditAway {
	
		public static boolean oneEditReplace(String s1, String s2) {
			boolean foundDifference = false;
			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) != s2.charAt(i)) {
					if (foundDifference) {
						return false;
					}
					
					foundDifference = true;
				}
			}
			return true;
		}
		
		/* Check if you can insert a character into s1 to make s2. */
		public static boolean oneEditInsert(String s1, String s2) {
			int index1 = 0;
			int index2 = 0;
			while (index2 < s2.length() && index1 < s1.length()) {
				if (s1.charAt(index1) != s2.charAt(index2)) {
					if (index1 != index2) {
						return false;
					}		
					index2++;
				} else {
					index1++;
					index2++;
				}
			}
			return true;
		}	
		
		public static boolean oneEditAway(String first, String second) {
			if (first.length() == second.length()) {
				return oneEditReplace(first, second);
			} else if (first.length() + 1 == second.length()) {
				return oneEditInsert(first, second);
			} else if (first.length() - 1 == second.length()) {
				return oneEditInsert(second, first);
			} 
			return false;
		}
		
		public static void main(String[] args) {
			String a = "pile";
			String b = "pale";
			boolean isOneEdit = oneEditAway(a, b);
			System.out.println(a + ", " + b + ": " + isOneEdit);
			System.out.println("bat : bats "+oneEditAway("bat", "bats"));
			System.out.println("pat : past "+oneEditAway("pat", "past"));
			System.out.println("race : ace "+oneEditAway("race", "ace"));
			System.out.println("mike : make "+oneEditAway("mike", "make"));
		}

	}