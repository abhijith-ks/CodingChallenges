package io.abhijith.challenges;

/**
 * Given a non array of integers, every element appears twice, except one. Find that single one.
 * 
 * @author i332773
 *
 */

public class SingleNumber {
	
	public void findSolution(int[] a) {
		
		int x = 0;
		for(int i = 0;i < a.length; i++) {
			x = x ^ a[i];
		}
		
		System.out.println(x);
	}

}
