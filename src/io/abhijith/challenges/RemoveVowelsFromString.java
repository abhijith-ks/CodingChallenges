package io.abhijith.challenges;

public class RemoveVowelsFromString {
	
	String s = "leetcodeisacommunityforcoders";
	
	public void findSolution() {
		
		String buffer = "";
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o' && s.charAt(i) != 'u') {
				buffer += s.charAt(i);
			}
		}
		
		System.out.println(buffer);
		
	}

}
