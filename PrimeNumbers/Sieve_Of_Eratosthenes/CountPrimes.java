/* Leetcode 204. Count Primes 
 * Count the number of prime numbers less than a non negative number n
 *
 * Example 1:
 * Input n = 10
 * Output = 4
 * Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7
 * 
 * Example 2:
 * Input n = 0
 * Output = 0
 * Explanation: There are no prime numbers
 * 
 * Sieve of Eratosthenes. 
 */

import java.util.*;
public class CountPrimes {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		boolean[] composites = new boolean[n+1];
		System.out.println(sieve(n, composites));
	}
	static int sieve(int n, boolean[] arr){
		int limit = (int)Math.sqrt(n);        // Square root of n can also be written as Math.squrt(n) 
		for(int i = 2; i <= limit; i++){			
			if(!arr[i]){						
				for(int j = i*i; j<= n; j+=i){  
					arr[j] = true;				
				}                               
			}								   
		}	
		int count = 0;
		for(int i = 2; i<=n; i++)				
			if(!arr[i])	count++	;				 
		return count;
	}
}
