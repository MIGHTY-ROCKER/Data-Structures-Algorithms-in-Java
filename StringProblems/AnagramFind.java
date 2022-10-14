/* Java program to find whether the given stings are Anagram or not
   
   Input1: aab
   Input2: baa
   Output: Given strings are Anagram
   
   Input1: kabab
   Input2: babau
   Output: Given strings are not Anagram
   
   Explanation:
    Both input String should have same elements but there is no need for same order.
   
   Algorithm:
    Step1: Remove the spaces from the input words.
    Step2: Check for both input String's length -> if same: go to Step3, else: return false.
    Step3: Convert Strings to char array and sort it
    Step4: if sorted array has same elements: it's anagram, else: return false.
    
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
  
	static boolean check(String s1, String s2) {
    
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
  
}
