// If the input is 1996 then the output will 9661.

import java.util.Scanner;

public class ReversNumber{
  
  static void reverse(int n){
    int reverse = 0;
    while(n>0){
      int y = n%10;
      reverse=(reverse*10)+y;
      n/=10;
    }
    System.out.println(reverse);
  }
  
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    reverse(n);
  }
}
