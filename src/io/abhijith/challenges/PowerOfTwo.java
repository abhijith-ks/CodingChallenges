package io.abhijith.challenges;

/**
 * Given a number, check whether it is a power of two
 * 
 * @author i332773
 */

public class PowerOfTwo {
	
	public void findSolution(int a) {
		
		long i = 1;
		while(i < a) {
			i *= 2;
		}
		
		if(i == a) {
			System.out.println("It is a power of two");
		} else {
			System.out.println("Not a power of two");
		}
	
	}

}
 