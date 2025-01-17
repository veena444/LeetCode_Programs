package string;
/*
 * You are given two strings s and t.

String t is generated by random shuffling string s and then add one more letter at a random position.

Return the letter that was added to t.

Example 1:

Input: s = "abcd", t = "abcde"
Output: "e"
Explanation: 'e' is the letter that was added.
Example 2:

Input: s = "", t = "y"
Output: "y"
 */
public class FindTheDifference {

	public static void main(String[] args) {
		String s = "abcd";
		String t = "abcde";
		System.out.println(findTheDifference(s,t));
	}
	
	public static char findTheDifference(String s, String t) {
		int total = 0;
		for(int i=0;i<t.length();i++) {
			total = total + t.charAt(i);
		}
		for(int i =0 ;i<s.length();i++) {
			total = total - s.charAt(i);
		}
		return (char) total;
		
	}

}
