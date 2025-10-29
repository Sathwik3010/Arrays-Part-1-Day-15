package com.codegnan.arrays;

import java.util.Scanner;

public class MiddleValues {

	public static int[] findMidValues(int[] a, int[] b) {
		int[] result = new int[2];
		result[0] = a[1];
		result[1] = b[1];
		
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] a = new int[3];
		int[] b = new int[3];

        System.out.println("Enter roll numbers of first section:");
        for(int i=0;i<3;i++) {
        	a[i]=sc.nextInt();
        }
        
        System.out.println("Enter roll numbers of second section:");
        for(int i=0;i<3;i++) {
        	b[i]=sc.nextInt();
        }
        
        int[] result = findMidValues(a,b);
        
        System.out.print("Middle roll numbers: [");
        for(int i=0;i<result.length;i++) {
        	System.out.print(result[i]);
        	if(i<result.length-1)
        		System.out.print(", ");
        }
        System.out.println("]");

		sc.close();
	}

}
