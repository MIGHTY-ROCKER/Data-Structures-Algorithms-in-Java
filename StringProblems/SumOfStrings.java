/*
  Sum of two strings
  Input1: 143
  Input2: 111
  Output: 254
  
  Explanation:
    1+1 = 2, 4+1 = 5, 3+1=4
    Expected Output: 254
*/

import java.util.Scanner;

public class SumOfStrings {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s1 = input.nextLine();
		String s2 = input.nextLine();
		sum(s1, s2);
	}
	static void sum(String s1, String s2) {
		int sum = Integer.parseInt(s1) + Integer.parseInt(s2);
		System.out.println(sum);
	}
}
