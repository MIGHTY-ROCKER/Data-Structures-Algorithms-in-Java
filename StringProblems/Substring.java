/*
  Print substrings of the given input string
  Input: aaba
  Output: a
          aa
          aab
          ab
          aba
          ba
          a 
*/


import java.util.Scanner;

public class Substring {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s1 = input.nextLine();
		check(s1);
	}
	static void check(String s1) {
		for(int i = 0; i<s1.length(); i++) {
			for(int j = i+1; j<s1.length(); j++) {
				System.out.println(s1.substring(i,j));
			}
		}
		
	}
}
