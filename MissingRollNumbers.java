package com.codegnan.arrays;


public class MissingRollNumbers {
	
	public static int findMissingNumber(int[] arr){
		int n = arr.length + 1;
		int expectedSum = n * (arr[0]+arr[arr.length-1])/2;
		int actualSum = 0;
		
		for(int num:arr) {
			actualSum +=num;
		}
		return expectedSum - actualSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number of roll numbers (excluding missing one): ");
//        
//        int size = sc.nextInt();
//		int[] arr = new int[size];
//		
//        System.out.println("Enter the roll numbers:");
//        for(int i=0;i<size;i++) {
//        	arr[i] = sc.nextInt();
//        }
		  int[] rollNumbers1 = {1, 2, 4, 5};
	      int[] rollNumbers2 = {2, 3, 5, 6};
	      int[] rollNumbers3 = {10, 11, 13, 14};
        System.out.println("Missing Number:" + findMissingNumber(rollNumbers1));
        System.out.println("Missing Number:" + findMissingNumber(rollNumbers2));
        System.out.println("Missing Number:" + findMissingNumber(rollNumbers3));

	}

}
