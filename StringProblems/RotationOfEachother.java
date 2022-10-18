/*
  Check the second String is rotation of first String
  
  Input1: tech
  Input2: chet
  Output: Second String is the rotation of first string
  
  Input1: tech
  Input2: chte
  Output: Not a rotated string
  
*/
import java.util.Scanner;

public class RotationOfEachother {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s1 = input.nextLine();
		String s2 = input.nextLine();
		check(s1, s2);
	}
	static void check(String s1, String s2) {
		String s  = s1+s1;
		if(s1 == null || s2 == null) {
			System.out.println("Not a rotated string");
		}
		else if(s1.length() != s2.length()) {
			System.out.println("Not a rotated string");
		}else if(s.contains(s2)) {
			System.out.println("Second String is the rotation of first string");
		}else {
			System.out.println("Not a rotated string");
		}
	}
}
