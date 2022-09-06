// Reversing elements in the array

import java.util.*;
public class ReverseArray {
		static void reverse(int[] arr) {
			int start = 0;
			int end = arr.length-1;
			while(start<end) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
		}
	    public static void main(String[] args) {
	           Scanner input = new Scanner(System.in);
	           int n = input.nextInt();
	           int arr[] = new int[n];
	           for(int i =0;i<n;i++) {
	               arr[i] = input.nextInt();
	           }
	           reverse(arr);
	           for(int e : arr) {
	        	   System.out.print(e + " ");
	           }
	          
	    }
}
