import java.util.Scanner;

public class AddDigits(
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    sum(n);
  }
  static void sum(int n){
    int add = 0;
    while(n!=0){
      int y = n%10;
      add += y;
      n/=10;
    }
    System.out.println(add);
  }
}
