/*  Generate N digit prime numbers. A digit prime is a prime number whose sum of digits are also prime
    For example the prime number 41 is a digit prime because 4 + 1 = 5 and 5 is a prime number. 17 is 
    not a digit prime number because 1 + 7 = 8, and 8 is not a prime number. 997 is also a digit prime,
    9 + 9 + 7 = 25 = 2 + 5 = 7
    
    Test case 1:
    Input:  N = 6
    Output: 2 3 5 7 11 23
    
    Test case 2:
    Input:  N = 6
    Output: 2 3 5 7 11 23 29 41 43 47 
*/

// Zoho - Round 2 - July 2022.

import java.util.*;
public class DigitPrime {
	public static void main(String[] args) {
		List<Integer> Prime = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the no. of prime numbers required: ");
		int target = input.nextInt();
		int count = 0;
		
		int i = 2;
		while(true) {
			
			boolean isprime = true;
			
			for(int j =2; j*j<=i; j++) {
				
				if(i%j == 0) {
					isprime = false;
					break;
				}
				
			}
			
			if(isprime) {
				
				int n = i;
				int sum = 0;
				while(n>0) {
					int temp = n %10;
					sum += temp;
					n = n/10;
				}
				
				if(sum % 2 != 0 || sum == 2) {
					Prime.add(i);
					count++;
					if(count>= target) {
						break;
					}
				}
				
			}
			
			i++;	
		}
		
		System.out.println(Prime);
	}
}
