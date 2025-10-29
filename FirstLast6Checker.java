package com.codegnan.arrays;

public class FirstLast6Checker {

	public static boolean firstLast6(int[] arr) {
		if(arr==null||arr.length==0) {
			return false;
		} else {
			if(arr[0]==6 || arr[arr.length-1]==6) {
				return true;
			} else {
				return false;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,3,6};
		System.out.println(firstLast6(arr1));
	}

}
