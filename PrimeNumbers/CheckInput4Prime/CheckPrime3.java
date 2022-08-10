
import java.util.*;

public class CheckPrime3{
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
    if(n == 2 || n == 3)
    	return true;
    if(n % 2 ==0 || n % 3 == 0)
    	return false;
    for(int i = 5; i*i < n; i+=6)
      if(n%i == 0 || n % (i+2) == 0)
        return false;
    return true;
  }
}