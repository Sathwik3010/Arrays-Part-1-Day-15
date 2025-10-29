package com.codegnan.arrays;

public class Fix2_and_3 {

	public static int[] fix23(int[] nums) {
		//check if  nums[0] is 2 and nums[1] is 3
		if(nums[0]==2 && nums[1]==3) {
			nums[1]=0;
		} 
		//check if nums[1] is 2 and nums[2] is 3
		if(nums[1]==2 && nums[2]==3) {
			 nums[2]=0;
		}
		return nums;
	}
	// method to print the array.
	public static void printArray(int[] arr) {
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			if(i<arr.length-1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] testCases= {{1,2,3},
				{1,2,2},
				{2,3,3},
				{2,2,3},
				{2,3,2},
				{2,2,2}
				};
		
		for(int i=0;i<testCases.length;i++) {
			int[] result = fix23(testCases[i]);
			System.out.print("TestCase: "+(i+1)+" :");
			printArray(result);
			System.out.println();
		}
	}

}
