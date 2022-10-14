/*
  Print Even length words from the given string
  
  Input: Math is the basic thing in Engineering
  Output: Math is in
*/

import java.util.Scanner;

public class EvenLengthWord {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s1 = input.nextLine();
		even(s1);
	}
	static void even(String s1) {
		for(String s: s1.split("\\s")) {
			if(s.length()%2 == 0)
				System.out.print(s + " ");
		}
	}
}
