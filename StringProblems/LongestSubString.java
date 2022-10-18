/*
  Find the first Longest substring in the input String
  
  Input: abcdabcdeabc
  Output: abcde
*/

import java.util.HashSet;
import java.util.Scanner;

public class LongestSubString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		System.out.println(substring(s));
	}
	static String substring(String s) {
		HashSet<Character> set = new HashSet<>();
		String LongestOverAll = "";
		String LongestTillNow = "";
		for(int i = 0; i<s.length(); i++) {
			 if(set.contains(s.charAt(i))) {
				 LongestTillNow = "";
				 set.clear();
			 }
			 set.add(s.charAt(i));
			 LongestTillNow+=s.charAt(i);
			 if(LongestTillNow.length() > LongestOverAll.length()) {
				 LongestOverAll = LongestTillNow;
			 }
		}
		return LongestOverAll;
	}
}
