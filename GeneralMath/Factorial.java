import java.util.Scanner;

public class Factorial{
public static void main(String[] args){
	    Scanner input = new Scanner(System.in);
	    int n = input.nextInt();
	    sum(n);
	  }
	  static void sum(int n){
	    int fact = 1;
	    for(int i = 2 ; i<=n; i++){
	      fact*=i;
	    }
	    System.out.println(fact);
	  }
	}
