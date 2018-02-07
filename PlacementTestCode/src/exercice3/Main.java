package exercice3;

import java.util.Stack;

public class Main {
	
	

	public static void main(String[] args) {
		String text = new String("asymmetric");
		
		
		System.out.println(reverse(text));
		
	}
	
	
	
	public static String reverse(String text) {
		Stack<Character> deque = new Stack<>();
		
		for(int i = 0; i<text.length(); i++) {
			deque.add(text.charAt(i));
		}
		
		StringBuilder result = new StringBuilder();
		for(int i = 0; i<text.length(); i++) {
			result.append(deque.pop());
			
		}
		return result.toString();
	
	}

}
