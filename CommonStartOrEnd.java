package com.codegnan.arrays;

import java.util.Scanner;

public class CommonStartOrEnd {

	public static boolean hasCommonStartOrEnd(int[] a, int[]b) {
		
		if(a.length == 0 || b.length == 0) 
			return false;
		
		return (a[0] == b[0] || (a[a.length - 1] == b[b.length - 1]));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of first route: ");

        int n1=sc.nextInt();
        int[] a = new int[n1];
        System.out.println("Enter the stops for first route");
        for(int i=0;i<n1;i++) {
        	a[i]=sc.nextInt();
        }
        
        
        System.out.print("Enter size of second route: ");

        int n2=sc.nextInt();
        int[] b = new int[n2];
        System.out.println("Enter the stops for second route");
        for(int i=0;i<n2;i++) {
        	b[i]=sc.nextInt();
        }
        
        boolean result = hasCommonStartOrEnd(a, b);
        System.out.println(result);
        sc.close();
	}

}
