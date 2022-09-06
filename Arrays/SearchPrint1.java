/* Given an array it can be the size of even or odd. Two keys, key1 and key2 are also given. The task is to print the elements between key1 and key2
Example:
Input: [7, 2, 5, 8, 6, 9, 4]  key1 = 5 and the key2 = 9
Output: 8 6
Note: Key1 and key2 are not indices of the array, those are elements in the given array.
*/

import java.util.*;
public class SearchPrint1 {
		static void search(int[] arr, int key1, int key2) {
			int index1 = -1;
			int index2 = -1;
			for(int i = 0; i<arr.length; i++) {
				if(arr[i] == key1)
					index1 = i;
			}
			for(int i = arr.length-1; i>=0; i--) {
				if(arr[i] == key2)
					index2 = i;
			}
			for(int i = index1+1; i<index2; i++) {
				System.out.print(arr[i]);
			}
		}		
	    public static void main(String[] args) {
	           Scanner input = new Scanner(System.in);
	           int arraySize = input.nextInt();   // Enter Size of the Array
	           int[] arr = new int[arraySize];
	           for(int i =0;i<arraySize;i++) {
	               arr[i] = input.nextInt();      // Enter the array
	           }
	           int key1 = input.nextInt();        // Enter the key1
	           int key2 = input.nextInt();        // Enter the key2
	           
	           search(arr, key1, key2);
	    }
}
