package com.interview.sortingarray;

public class QuickSort {

	public static void main(String[] args) {
		int arr [] = {30 , 1 , 29 , 34 , 78 , 24 , 7 , 83 , 12 , 45 , 72 , 85 , 19 , 38 , 49};
		quickSort(arr , 0 , arr.length-1);
		for(int i : arr)
		System.out.print(i+" ");
	}

	private static void quickSort(int[] arr , int low , int high ) {
		if(low < high) {
			int pi = partition(arr , low , high);
			quickSort(arr , low , pi -1);
			quickSort(arr , pi+1 , high);
		}
		
	}
	
	public static int partition(int [] a , int low , int high) {
		
		int i = low - 1 ;
		int r = a[high];
		
		for(int j = low ; j < high ; j++) {
			if(a[j] <= r) {
				i++;
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		int temp = a[i+1];
		a[i+1] = a[high];
		a[high] = temp;
		return i+1;
		
		
	}
	

}
