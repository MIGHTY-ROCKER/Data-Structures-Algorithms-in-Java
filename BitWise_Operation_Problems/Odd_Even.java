// Check whether the given input is Odd or Even

/* Basic Methodology
   If we & any number with 1 then the out put will be 1
   If WE & any number with 0 then the output will be 0
   
   IF the Least Significant Bit is 1, then the number is Odd. Similarly if the LSB is 0, then the number is Even.
*/

import java.util.*;
public class Odd_Even {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		if(check(n)) {
			System.out.println("EVEN");
		}
		else {
			System.out.println("ODD");
		}
		
	}
	static boolean check(int n){
		if((n&1) == 1) {
			return false;
		}
	return true;
	}
}
