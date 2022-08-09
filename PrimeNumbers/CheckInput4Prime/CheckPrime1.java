/* This one is a basic approach
 It iterates from 2 to n.
 Hence its time complexity is O(n)*/

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
    for(int i = 2; i < n; i++)
      if(n%i == 0)
        return false;
    return true;
  }
}
