package exercice1;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Main {
	
	
	

	public static void main(String[] args) {
		isPalindrome(12345);
		isPalindrome(123321);
		isPalindrome(121);
		isPalindrome(12335);

	}
	
	
	
	public static boolean isPalindrome(int number) {
		
		Deque<Character> deque = new ArrayDeque<>();
		Stack<Character> stack = new Stack<>();
		String numberString = Integer.toString(number);
		
		for(int i = 0; i<numberString.length(); i++) {
			deque.add(numberString.charAt(i));
			stack.add(numberString.charAt(i));
		}
		
		
		for(int i = 0; i<numberString.length(); i++) {
			if(deque.pop() != stack.pop()) {
				System.out.println("NO");
				return false;
			}
		}
		System.out.println("YES");
		return true;
	}

}
