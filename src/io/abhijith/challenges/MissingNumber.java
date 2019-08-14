package io.abhijith.challenges;

/**
 * Given an array containing n distinct numbers taken from 0,1,2...n
 * Find out the one that is missing from the array
 * 
 * @author i332773
 */

public class MissingNumber {

	public void findSolution(int a[]) {
	
		a = new int[] {9,6,4,2,3,5,7,0,1};
		
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		
		int n = a.length + 1;
		
		System.out.println( ((n * (n - 1)) / 2 ) - sum );
		
	}
	
}
