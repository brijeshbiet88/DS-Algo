package com.interview.ds.recursion;

public class ArraySum {

	public static void main(String[] args) {
		int array[] = { 2, 5, 1, 7 , 9};  
		int sum = recSum(array, array.length , 0);
	    System.out.println(sum); 
	}

	private static int recSum(int[] array , int size, int sum) {
		if (size == 0)  
	        return sum; 
	  
	    // Function Call Observe sum+array[size-1] 
	    // to maintain sum of elements 
	    return recSum(array, size - 1, sum + array[size - 1]); 
	}

}
