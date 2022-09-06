/* Program to count and print no of even elements in an array

This one is a linear search, I assumed input as unsorted and it has complexity of O(n). */

import java.util.*;
public class CountEven {
		static void count(int[] arr) {
			int count =0;
		for(int i = 0 ; i<arr.length; i++) {
			if(arr[i]%2 == 0)
				count++;
		}
		System.out.println(count);
		}
	    public static void main(String[] args) {
	           Scanner input = new Scanner(System.in);
	           int n = input.nextInt();
	           int arr[] = new int[n];
	           for(int i =0;i<n;i++) {
	               arr[i] = input.nextInt();
	           }
	           count(arr);
	    }
}
