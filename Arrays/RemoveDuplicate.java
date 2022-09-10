/*  This Remove duplicate elements from given array.
    Input:
    Enter the size of the Matrix: 8
    Enter the array elements: 3 2 4 2 7 6 3 8
    Output: 4 6 7 8 // This program will sort and print the non duplicate elements.
*/

import java.util.*;

public class Solution {
        static int max(int[] a){
        int n = a.length;
        int max = a[n-1];
        for(int i = n-1; i>= 0; i--){
            if(a[i]>max){
                max = a[i];
            }
        }
        return max;
    }
    static int min(int[]a){
        int min = a[0];
        for(int i =1; i<a.length;i++){
            if(a[i]<min){
                min = a[i];
            }
        }
        return min;
    }
    static void hash(int[] a){
        int n = a.length;
        int max = max(a);
        int min = min(a);
        int b[] = new int[max+1];
        for(int i = 0; i<n; i++){
            int x = a[i];
            b[x]++;
        }
        for(int i =0; i<max+1; i++){
            int x = b[i];
            if(x == 1){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int n = input.nextInt();
        int a[] = new int[n];
        for(int i =0; i<n;i++){
            a[i] = input.nextInt();
        }
        hash(a);
    }
}
