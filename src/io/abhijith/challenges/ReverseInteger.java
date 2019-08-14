package io.abhijith.challenges;

public class ReverseInteger {
	
	public void findSolution(int num) {
		long temp = 0;
		
		while(num != 0) {
			int x = num % 10;
			temp = temp*10 + x;
			num = num / 10;
		}
		
		if(temp > Integer.MAX_VALUE) {
			System.out.println("Integer Overflow");
		} else {
			System.out.println(temp);
		}
	}
	
}
