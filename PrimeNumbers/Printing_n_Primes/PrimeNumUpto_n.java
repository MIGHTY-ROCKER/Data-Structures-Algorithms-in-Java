// Printing n number of prime numbers

import java.util.*;
public class PrimeNumUpto_n {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.print(primes(n));
	}
	static List<Integer> primes(int n){
		List<Integer> Prime = new ArrayList<>();
		int count = 0;
		int i = 2;
		while(true) {
			boolean isprime = true;
			for(int j = 2; j*j <= i; j++){			
				if(i%j == 0) {
					isprime = false;
					break;
				}
			}	
			if(isprime) {
				Prime.add(i);
				count++;
				if(count>=n) {
					break;
				}
			}
			i++;
		}
		return Prime;
	}
}
