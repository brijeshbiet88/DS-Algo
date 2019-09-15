package com.interview.stringmanipulation;

public class URLify {
		// Assume string has sufficient free space at the end
		// True length will hold the index of last non space character + 1 
		public static void replaceSpaces(char[] str, int trueLength) {
			int spaceCount = 0, index, i = 0;
			for (i = 0; i < trueLength; i++) {
				if (str[i] == ' ') {
					spaceCount++;
				}
			}
			index = trueLength + spaceCount * 2; // True Length plus 2 extra chars to replace space with %, 2, 0
			if (trueLength < str.length) str[trueLength] = '\0';
			str[index - 1] = str[trueLength -1];
			index--;
			for (i = trueLength - 2; i >= 0; i--) {
				if (str[i] == ' ') {
					str[index - 1] = '0';
					str[index - 2] = '2';
					str[index - 3] = '%';
					index = index - 3;
				} else {
					str[index - 1] = str[i];
					index--;
				}
			}
		}
		
		// Spaces in The Last to be ignored :
		
		public static int findLastCharacter(char[] str) {
			for (int i = str.length - 1; i >= 0; i--) {
				if (str[i] != ' ') {
					return i;
				}
			}
			return -1;
		}
		
		public static void main(String[] args) {
			String str = "Mr John Smith    ";
			char[] arr = str.toCharArray();
			int trueLength = findLastCharacter(arr) + 1;
			replaceSpaces(arr, trueLength);
			String s = new String(arr);
		// op: "Mr%20John%20Smith"
			System.out.println("\"" + s + "\"");
		}
	}