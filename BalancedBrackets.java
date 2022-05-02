/**
 * 
 */
package com.mentorSession.week9;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * @author Shreyas
 *
 */
public class BalancedBrackets {

	/**
	 * @param args
	 */

	Deque<Character> stack = new ArrayDeque<Character>();

	private String str;

	/**
	 * 
	 */
	public BalancedBrackets(String bracketString) {
		this.str = bracketString;
	}

	boolean check;

	public void checkBalanceBracket() {
		int len = str.length();
		for(int i = 0; i < len; i++) {
			char ch = str.charAt(i);
			
			if(ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			}
			
			switch(ch) {
			case ')': if(stack.peek() == '(') {
					stack.pop();
					break;
				}
			
			case ']' : if(stack.peek() == '[') {
					stack.pop();
					break;
				}
			
			case '}' : if(stack.peek() == '{') {
					stack.pop();
					break;
				}
			
			}
		}
		if(stack.isEmpty()) {
			System.out.println("The Brackets are balanced.");
		}else {
			System.out.println("The Brackets are unbalanced !");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the brackets");
		String brackets = sc.nextLine();
		BalancedBrackets bb = new BalancedBrackets(brackets);
		bb.checkBalanceBracket();
		sc.close();
	}

}
