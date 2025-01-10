package string;
/*
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

Example 1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true

Example 3:

Input: s = "(]"

Output: false

Example 4:

Input: s = "([])"

Output: true
 */
public class ValidParentheses {

	public static void main(String[] args) {
		String s = "([])";
		System.out.println(validParenthesis(s));

	}
	
	public static boolean validParenthesis(String s) {
		while(true) {
			if(s.contains("()")) {
				s = s.replace("()", "");
			}
			else if(s.contains("{}")) {
				s = s.replace("{}", "");
			}
			else if(s.contains("[]")) {
				s = s.replace("[]", "");
			}
			else {
				return s.isEmpty();
			}
				
		}
		
	}

}
