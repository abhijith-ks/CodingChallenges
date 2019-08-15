package io.abhijith.challenges;

/**
 * Given two string X and Y. 
 * The task is to find the length of longest subsequence of string X which is substring in sequence Y.
 * Subsequence not necessarily to be continues
 * 
 * Dynamic Programming
 * 
 * @author abhijith-ks
 */

import java.util.Arrays;

public class LongestCommonSubsequence {
	Integer mem[][] = new Integer[5][6];

	public void findSolution() {
		
		for(int i=0;i<5;i++)
			Arrays.fill(mem[i], -1);
		
		System.out.println(lcs("BATD","ABACD",0,0));
	}
	
	public int lcs(String p, String q, int n, int m) {
		
		int result;
		if(mem[n][m] != -1)
			return mem[n][m];
		
		if(n == p.length() || m == q.length())
			result = 0;
		else if (p.charAt(n) == q.charAt(m)) {
			result = 1 + lcs(p,q,n+1,m+1);
		}
		else {
			int temp1 = lcs(p,q,n,m+1);
			int temp2 = lcs(p,q,n+1,m);
			result = Integer.max(temp1, temp2);
		}
		mem[n][m] = result;
		
		return result;
	}
	
}
