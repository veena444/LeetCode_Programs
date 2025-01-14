package string;
/*
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * 
 * Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false
 */
public class ValidAnagram {

	public static void main(String[] args) {
		
		String s = "rat";
		String t = "car";
		System.out.println(isAnagram(s,t));
		

	}
	
	public static boolean isAnagram(String s, String t) {
		//convert to lower case
		s = s.toLowerCase();
		t = t.toLowerCase();
		
		//remove all white spaces
		s = s.replace(" ", "");
		t = t.replace(" ", "");
		
		//initialize the bucket array
		int[] counts = new int[26];
		
		//fill the bucket
		for(int i=0;i < s.length();i++) {
			counts[s.charAt(i) - 'a'] ++;
		}
		
		//empty the bucket
		for(int i =0;i < t.length();i++) {
			counts[t.charAt(i) -'a']--;
		}
		
		//check if all buckets are empty
		for(int count: counts) {
			if(count != 0) {
				return false;
			}
			
		}
		return true;
		
	}

}
