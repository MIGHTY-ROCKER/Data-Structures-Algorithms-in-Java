/*
  Print First Non repeated character in a string
  
  Input: CLOCK
  Output: L
  
  Input: repeater
  Output: p
*/

import java.util.Scanner;

public class FirstNonRepeatedChar {
	static void check(String s1) {
		for(int i = 0; i<s1.length(); i++) {
			char c = s1.charAt(i);
			boolean repeat = false;
			for(int j = i+1; j<s1.length(); j++) {
				if(c == s1.charAt(j)) {
					repeat = true;
					break;
				}
			}
			if(repeat == false) {
				System.out.print(c);
				break;
			}
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s1 = input.nextLine();
		check(s1);
	}
}
