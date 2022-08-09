/* This one is a much effective approach 
 It iterates from 2 to √n. 
 Hence its time complexity is O(√n)
 
 Lets take 81 as example, which is not a prime number
                    1 x 81 = 81
                    3 x 27 = 81
                    9 x  9 = 81
                    27 x 3 = 81
                    81 x 1 = 81
We can see after the square the number keeps repeated. So, there is no necessary to check all the numbers.
Hence only make checks which is less than the square root of the input number itself. */

import java.util.*;

public class CheckPrime1{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    	int n = input.nextInt();
    if(primeNum(n))
      System.out.println("You've entered a prime number");
    else
      System.out.println("Negative");
  }
  static boolean primeNum(int n){
    if(n <= 1)
      return false;
    for(int i = 2; i*i <= n; i++) //  i = √n we can write it as i * i = n
      if(n%i == 0)
        return false;
    return true;
  }
}
