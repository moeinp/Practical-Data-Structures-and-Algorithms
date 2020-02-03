package stack;

public class ReverseString {
	public static void main(String[] args) {
		System.out.println(reverse("Hello"));
		System.out.println(reverse("H"));
		System.out.println(reverse("hi"));
		System.out.println(reverse("ABC"));
		System.out.println(reverse(" A B C"));

	}

	public static String reverse(String s) {
		CharStack stck = new CharStack(s.length()); // make a stack with the same size as our String
		for (int i = 0; i < s.length(); i++) { // push all chars of our string onto the stack
			stck.push(s.charAt(i));
		}
		String reversedString = ""; // result string
		while (!stck.isEmpty()) { // pop all chars and append onto the result string
			reversedString += stck.pop();
		}
		return reversedString;
	}
}
