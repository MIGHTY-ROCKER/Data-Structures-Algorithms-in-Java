import java.util.Scaner;

public class Power{
public static void main(String[] args){
		  Scanner input = new Scanner(System.in);
	      // a is number and b is its power.
		  int a = input.nextInt();
	      int b = input.nextInt();
		    pow1(a,b);
	      pow2(a,b);
		  }
		  static void pow1(int a, int b){
		    int ans = 1;
	      for(int i = 1; i<=b;i++){
	        ans*=a;
		    }
		    System.out.println(ans);
		  }
	    static void pow2(int a, int b){
	      // pow is a function available in math class of java.lang package. 
        // There is no need to import java.lang.Math; package because it is default.
	      System.out.println(Math.pow(a,b));
	    }
		}
