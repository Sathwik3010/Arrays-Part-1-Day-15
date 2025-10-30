package com.codegnan.arrays;

import java.util.Scanner;

public class ExtendArray {

	public static int[] extendAndKeepLast(int[] arr) {
		int newSize = arr.length * 2;
		int[] newArr = new int[newSize];
		newArr[newSize - 1] = arr[arr.length - 1];
		return newArr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n =sc.nextInt();
		
		int[]arr = new int[n];
		System.out.println("Enter elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int[] result = extendAndKeepLast(arr);
        System.out.print("Result: [");
        for (int i = 0; i < result.length; i++) {
        	System.out.print(result[i]);
        	if(i<result.length-1)
        		System.out.print(", ");
	}
        System.out.println("]");
	}
}
