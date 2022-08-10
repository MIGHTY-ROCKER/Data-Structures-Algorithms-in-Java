/* Sieve of Eratosthenes
 * Initially all the elements in the boolean array are false, before assigning it as true.
 * This code finds the prime number and marks it as false and marks all the multiples of the prime number as true.
 * If multiples becomes true, then all false elements are prime. And printing it gives desired output.
 */

import java.util.*;
public class Sieve {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		boolean[] arr = new boolean[n+1];
		sieve(n, arr);
	}
	static void sieve(int n, boolean[] arr){
		if(n<=1)
			System.out.println("Nothing found");
		for(int i = 2; i* i <= n; i++){			// i starts from 2 and it will be iterated up to square root of n
			if(!arr[i]){						
				for(int j = i*i; j<= n; j+=i){  // We also can write j = i * 2 since we are making the multiples as true,
					arr[j] = true;				// But, while iterating more numbers using j = i*i skips the marked true elements.
				}                               
			}								    // while using i*2 the iteration starts from marked element.
		}										// it is not required because we know while a number has no factors from 2 to sq. root of the same number,
		for(int i = 2; i<=n; i++)				// Then it has no factors other than itself.
			if(!arr[i])							// This code increments j = j+i because it marks multiples of i as true. 
				System.out.print(i + " ");
	}
}
