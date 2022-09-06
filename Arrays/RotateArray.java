// [6 7 8 9 1 5] ==> [1 5 6 7 8 9] if the rotation is 2

import java.util.*;
public class RotateArray {
		static void rotate(int[] arr, int c) {
			   while(c>0) {
				   int l = arr.length-1;
				   int h = arr[l];
				   for(int i = l; i>0;i--) {
					   arr[i] = arr[i-1];
				   }
				   arr[0] = h;
				   c--;
			   }
		}
	    public static void main(String[] args) {
	           Scanner input = new Scanner(System.in);
	           int n = input.nextInt(); // Enter the size of the array
	           int arr[] = new int[n];  
	           for(int i =0;i<n;i++) {
	               arr[i] = input.nextInt(); // Enter the elements in the array according to its size
	           }
	           int c = input.nextInt(); // Enter the number of rotations required.
	           rotate(arr, c);
	           for(int e : arr) {
	        	   System.out.print(e + " ");
	           }
	    }
}
