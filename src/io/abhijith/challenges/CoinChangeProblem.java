package io.abhijith.challenges;

/**
 * You are given coins of different denominations and a total amount of money amount. 
 * Write a function to compute the fewest number of coins that you need to make up that amount. 
 * If that amount of money cannot be made up by any combination of the coins, return -1.
 * 
 * Dynamic Programming
 * 
 * @author abhijith-ks
 */

public class CoinChangeProblem {
	
	
	int[] coins = new int[] {1,5,6,8};
	int key = 11;
	
	public void findSolution() {
		
		int[] arr = new int[key + 1];
		arr[0] = 0;
		
		for(int i = 1; i <= key; i++) {
			arr[i] = key + 1;
		}
		
		for(int i = 1; i <= key; i++) {
			for(int j = 0; j < coins.length; j++) {
				int min = arr[i];
				if(i < coins[j]) {
					continue;
				}
				
				int temp = arr[i - coins[j]] + 1;
				arr[i] = Math.min(min, temp);
			}
		}
		
		
		System.out.println(arr[key]);
		
	}

}
