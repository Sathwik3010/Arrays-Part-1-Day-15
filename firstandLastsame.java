package com.codegnan.arrays;

public class firstandLastsame {
	public static boolean firstLast6Same(int[] arr) {
		if(arr.length>=1 && arr[0] == 6 && arr[arr.length-1] == 6) {
			return true;
		} else {
			
				return false;
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,2,3};
		System.out.println(firstLast6Same(arr1));
		int[] arr2= {6,2,6};
		System.out.println(firstLast6Same(arr2));
		int[] arr3= {6,2,1};
		System.out.println(firstLast6Same(arr3));
	}

}
