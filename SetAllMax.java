package com.codegnan.arrays;

import java.util.Scanner;

public class SetAllMax {

	public static void setToMax(int[] arr) {
		int max= Math.max(arr[0], arr[arr.length-1]);
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=max;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int[] mark = new int[3];
		
		System.out.println("Enter marks of three tests:");
		for(int i=0;i<mark.length;i++) {
			mark[i]=sc.nextInt();
		}
		setToMax(mark);
		
        System.out.print("Updated marks: [");
        for(int i=0;i<mark.length;i++) {
        	System.out.print(mark[i]);
        	if(i<mark.length-1)
        		System.out.print(", ");
        }
        System.out.print("]");
        sc.close();
	}

}
