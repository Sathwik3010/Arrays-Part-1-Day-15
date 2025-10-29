package com.codegnan.arrays;

import java.util.Scanner;

public class RotateStudetId {

	public static void rotateLeft(int[]id) {
		if(id.length ==0 )
			return;
		int first = id[0];
		for(int i=0;i<id.length-1;i++) {
			id[i]=id[i+1];
		}
		id[id.length-1] = first;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[] ids = new int[n];
        System.out.println("Enter student IDs:");
        for(int i=0;i<n;i++) {
        	ids[i]=sc.nextInt();
        }
        
        rotateLeft(ids);
        
        System.out.print("After rotation: [");
        for(int i=0;i<n;i++) {
        	System.out.print(ids[i]);
        	if(i<n-1)
        		System.out.print(",");
        }
        System.out.println("]");

		sc.close();
	}

}
