package io.abhijith.dailycodingproblem;

/**
 * Edit distance between two characters refers to the minimum number of character insertions, deletions and substitutions
 * required to change one string to other.
 * 
 * Example: Edit distance between "kitten" and "sitting" is 3
 * 
 * @author abhijith-ks
 *
 */

public class EditDistanceBetweenTwoStrings {
	
	String s1;
	String s2;
	
	public void findSolution(String s1, String s2) {
		
		this.s1 = s1;
		this.s2 = s2;
		
		int m = s1.length();
		int n = s2.length();
		
		System.out.println(editDistance(m, n));
		
	}
	
	public int editDistance(int m, int n) {
		
		// s1 is empty, s2.length() is the result
		if(m == 0)
			return n;
		
		// s2 is empty, s1.length() is the result
		if(n == 0)
			return m;
		
		// if the characters are equal no need to consider
		if(s1.charAt(m-1) == s2.charAt(n-1))
			return editDistance(m-1, n-1);
		
		// if there is a distance, following cases are to be considered
		return 1 + min(
				editDistance(m, n-1), // insert
				editDistance(m-1, n), // remove
				editDistance(m-1, n-1) // replace
				);
		
	}
	
	public int min(int x, int y, int z) {
		if(x <= y && x <= z) return x;
		if(y <= x && y <= z) return y;
		return z;
	}

}
