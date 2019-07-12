package io.abhijith.dailycodingproblem;

/**
 * There exists a staircase with N steps
 * you can climb either 1 or 2 steps at a time
 * 
 * Given N, write a function that returns the number of unique ways you can climb the stairs
 * The order of the steps matters
 * 
 * Example: If N is 4, then there are 5 unique ways:
 * - 1,1,1,1
 * - 2,1,1
 * - 1,2,1
 * - 1,1,2
 * - 2,2
 * 
 * @author i332773
 *
 */

public class UniqueWaysToClimbSteps {

	public void findSolution(int num_steps) {
		
		System.out.println(getWays(num_steps));
		
	}
	
	public int getWays(int n) {
		if(n <= 1)
			return 1;
		return getWays(n-1) + getWays(n-2);
	}
	
	
}
