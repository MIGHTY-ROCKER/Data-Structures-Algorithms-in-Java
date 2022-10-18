/*
  Check for the given string is Panagram or not
  
  Input: The quick brown fox jumps over the lazy dog.
  Output: The given String is a Panagram.
  
  Explanation:
    Panagram means a sentense with all English alphabets a to z
*/

import java.util.Scanner;

public class Panagram {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		if(check(s))
			System.out.println("The given String is a Panagram");
		else
			System.out.println("The given String is not a Panagram");
	}
	static boolean check(String s) {
		if(s.length() <26) {
			return false;
		}else {
			for(char i = 'a'; i<='z'; i++) {
				if(s.indexOf(i)<0) 
					return false;
			}
		}
		return true;
	}
}
