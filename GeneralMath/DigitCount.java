import java.util.Scanner;

class DigitCount{
  
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    count(n);
  }
  
  static void count(int n){
  int count = 0;
    
  while(n!=0){
    count++;
    n/=10;
  }
    
  System.out.println(count);
  }
  
}
