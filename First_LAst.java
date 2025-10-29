package com.codegnan.arrays;

import java.util.Scanner;

public class First_LAst {

	public static int[] firstLastRoll(int[] rolls) {
		int[] ends = new int[2];
		ends[0] = rolls[0];
		ends[1] = rolls[rolls.length-1];
		
		return ends;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Roll no");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter roll numbers");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
	  int[] ends = firstLastRoll(arr);
	   
       System.out.print("first and last: [");
       for(int i=0;i<ends.length;i++) {
    	   System.out.print(ends[i]);
    	   if(i<ends.length-1)
    		   System.out.print(", ");
       }
	   System.out.println("]");

		sc.close();
	}

}
