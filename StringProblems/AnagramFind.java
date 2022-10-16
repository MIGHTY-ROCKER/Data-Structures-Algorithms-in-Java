/* Java program to find whether the given stings are Anagram or not
   
   Input1: aab
   Input2: baa
   Output: Given strings are Anagram
   
   Input1: kabab
   Input2: babau
   Output: Given strings are not Anagram
   
   Explanation:
    Both input String should have same elements but there is no need for same order.
   
   I've written two methods. One is done on traditional way and another one is done using StringBuilder.
   
   check1 Algorithm:
    Step1: Remove the spaces from the input words.
    Step2: Check for both input String's length -> if same: go to Step3, else: return false.
    Step3: Convert Strings to char array and sort it
    Step4: if sorted array has same elements: it's Anagram, else: return false.
   
   check2 Algorithm:
    Step1: Create a character array for 1st input string (s1)
    Step2: Create a StringBuilder for 2md input string (s2)
    Step3: Find and deleter the index of character in StringBuffer (sb) for each characters in character array c which is created from s1.
    Step4: Finally after deleting all the relevent characters if the length of sb == 0, then its Anagrm. else return false.
    
*/

import java.util.Arrays;
import java.util.Scanner;

public class AnagramFind {
  
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s1 = input.nextLine();
		String s2 = input.nextLine();
		s1 = s1.replaceAll("\\s", "");
		s2 = s2.replaceAll("\\s", "");
		if(check(s1, s2))
			System.out.println("Given strings are Anagram");
		else
			System.out.println("Given strings are not Anagram");
	}
  
	static boolean check1(String s1, String s2) {
    
		if(s1.length() != s2.length()) {
			return false;
		}
    
		else {
      
			char c1[] = s1.toCharArray();
			char temp;
			for(int i = 0; i<c1.length; i++)
				for(int j = i+1; j<c1.length; j++) {
					if(c1[j]<c1[i]) {
						temp = c1[i];
						c1[i] = c1[j];
						c1[j] = temp;
					}
				}
      
			char c2[] = s2.toCharArray();
			for(int i = 0; i<c2.length; i++)
				for(int j = i+1; j<c2.length; j++) {
					if(c2[j]<c2[i]) {
						temp = c2[i];
						c2[i] = c2[j];
						c2[j] = temp;
					}
				}
			return Arrays.equals(c1, c2);
		}
    
	}
  
	static boolean check2(String s1, String s2){
		char c[] = s1.toCharArray();
		StringBuilder sb = new StringBuilder(s2);
		for(char ch: c){
			int index = sb.indexOf(String.valueOf(ch));
			if(index != -1){
				sb.deleteCharAt(index);
			}
			else
				return false;
		}
		return sb.length() == 0;
	}
}
