package io.abhijith.challenges;

/**
 * A message containing letters from A-Z is being encoded to numbers using the following mapping.
 * 'A' -> 1
 * 'B' -> 2
 * ...
 * ...
 * 'Z' -> 26
 * Given a non-empty string containing only digits, determine the total number of ways to decode it.
 * 
 * @author abhijith-ks
 */

public class DecodeWaysDP {
	
	public void findSolution(String s) {
		int[] dp = new int[s.length() + 1];
		dp[0] = 1;
		dp[1] = (s.charAt(0) == '0') ? 0 : 1;
		for(int i = 2; i <= s.length(); i++) {
			int oneDigit = Integer.parseInt(s.substring(i-1, i));
			int twoDigit = Integer.parseInt(s.substring(i-2, i));
			if(oneDigit >= 1) {
				dp[i] += dp[i - 1];
			}
			if(twoDigit >= 10 && twoDigit <= 26) {
				dp[i] += dp[i - 2];
			}
		}
		
		System.out.println(dp[s.length()]);
	}

}
