package com.codegnan.arrays;

import java.util.Scanner;

public class SecondHighestScore {

	public static int findSecondHighest(int[] scores) {
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;

		for(int score: scores) {
			if(score>highest) {
				secondHighest = highest;
				highest = score;
			} else if(score>secondHighest && score<highest) {
				secondHighest = score;
			}
		}
		return secondHighest;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of players: ");
		int n = sc.nextInt();
		
		int[] scores = new int[n];
        System.out.println("Enter runs scored by each player:");
        for(int i=0;i<scores.length;i++) {
        	scores[i]=sc.nextInt();
        }
        
        int result = findSecondHighest(scores);
        System.out.println("Second Highest: "+result);
        sc.close();
	}

}
