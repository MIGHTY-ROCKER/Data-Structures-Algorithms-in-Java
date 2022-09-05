/* Java program to add first and last armstrong number in the given range. The range of Upper Limit and Lower limit will be given.

Armstrong number
1634 
totally 4 numbers in 1634
1^4 + 6^4 + 3^4 + 4^4 = 1634  // which is called armstrong number.

163 
totally 3 numbers in 163
1^3 + 6^3 + 3^3 = 1378 != 163 // which is not an armstrong number.

Example:
Input: ll = 1 and ul = 100
Output: 10
Explanation: The armstrong numbers in the given range of 1 to 100 are 1 2 3 4 5 6 7 8 9.
                1st armstrong number is 1 and the last armstrong number is 9. 1+9 = 10. */

import java.util.Scanner;

public class Armstrong { // This function wwill sum the 1st and last armstrong number.
    int start = 0;
    int end = 0;
  	static void rangesum(int ll, int ul) {
		for(int i = ll; i<=ul; i++) {
			if(armstrong(i)) 
				start = i;
		}
    for(int j =ul; j<=ll; j--){
      if(armstrong(j))
        end = j;
    }
    System.out.println(Start+End);
	}
  
	static boolean armstrong(int n) {  // this function will tell the numbers obtained from countfunction is armstrong or not.
		int n1 =n;
		int sum = 0;
		int p = count(n);
		while(n>0) {
			int y = n%10;
			int temp = (int) Math.pow(y, p);
			sum+=temp;
			n/=10;
		}
		if(sum == n1) {
			return true;
		}
	return false;
	}
  
	static int count(int n) {  // this function will count the numbers iterated in rangesum function and the counted value will be moved to armstrong function as power.
		int count = 0;
		while(n>0) {
			count++;
			n/=10;
		}
		return count;
	}
  
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int ll = input.nextInt();
		int ul = input.nextInt();
		rangesum(ll,ul);
	}
}
