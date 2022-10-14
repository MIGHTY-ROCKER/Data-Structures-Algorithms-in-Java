/*
  Check the input string is Well formed or Not
  Input: {[()]}
  Output: Given string is well formed
  
  Input: {[)}
  Output: Given string is not so well formed
  
  Algorithm:
    Step 1: Create a stack, Initially the stack will be empty so push the 0th element in the String to stack.
    Step 2: If the character is '{' or '[' or '(' or '<' push it into the stack
    Step 3: If the character is '}' or ']' or ')' or '>', and peek the opposite for it '{' or '[' or '(' or '<'. If any matches found pop it out.
    Step 4: Finally if the Stack is empty, then the Given string is well formed. else, Given string is not so well formed.
*/
import java.util.Scanner;
import java.util.Stack;

public class WellFormedStringCheck {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s1 = input.nextLine();
		if(check(s1))
			System.out.println("Given string is well formed");
		else
			System.out.println("Given string is not so well formed");
	}
	static boolean check(String s1) {
		Stack<Character> s = new Stack<>();
		
		for(int i =0; i<s1.length(); i++){
			char ch = s1.charAt(i);
			if(s.empty()) {
				s.push(ch);
			}
			else if(ch == '{' || ch =='(' || ch == '[' || ch == '<' ) {
				s.push(ch);
			}
			else if(ch == '}' && s.peek() == '{') {
				s.pop();
			}
			else if(ch == ']' && s.peek() == '[') {
				s.pop();
			}
			else if(ch == ')' && s.peek() == '(') {
				s.pop();
			}
			else if(ch == '>' && s.peek() == '<') {
				s.pop();
			}
		}
		if(s.empty())
			return true;
		return false;
	}
}
