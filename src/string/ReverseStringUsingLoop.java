package string;

public class ReverseStringUsingLoop {

	public static void main(String[] args) {
		String str = "Veena";
		System.out.println(reverse(str));

	}
	
	public static String reverse(String str) {
		String reverse = "";
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			reverse = ch + reverse;
		}
		return reverse;
	}

}
