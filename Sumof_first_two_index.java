package com.codegnan.arrays;

public class Sumof_first_two_index {

	public static int sumFirstTwo(int[] arr){
		if(arr==null||arr.length==0) {
			return 0;
		} else {
			if(arr.length==1) {
				return arr[0];
			} else {
				return arr[0]+arr[1];
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,2,3};
		System.out.println("Sum: "+sumFirstTwo(arr1));
		int[] arr2= {1};
		System.out.println("Sum: "+sumFirstTwo(arr2));
		int[] arr3= {5,5};
		System.out.println("Sum: "+sumFirstTwo(arr3));
		int[] arr4= {};
		System.out.println("Sum: "+sumFirstTwo(arr4));
	}

}
