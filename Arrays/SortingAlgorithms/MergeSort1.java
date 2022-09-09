/* Given 2 sorted array, Merge and print it also remove the duplicates.
  Input:
  5               -> Size of the 1st Array
  1 2 3 6 9       -> Elements of the 1st Array
  4               -> Size of the 2nd Array
  2 4 5 10        -> Elements of the 2nd Array
  
  Output:
  1 2 3 4 5 6 9 10
  Repeated element 2 is removed.
*/

import java.util.*;

public class MergeSort1 {
    static void merge(int a[], int[] b){
        int m = a.length;
        int n = b.length;
        int i = 0; 
        int j = 0;
        while(i<m && j<n){
            if(a[i]<b[j]){
                System.out.print(a[i] + " ");
                i++;
            }
            else if(b[j]<a[i]){
                System.out.print(b[j] + " ");
                j++;
            }
            else{
                System.out.print(a[i] + " ");
                i++;
                j++;
            }
        }
        while(i<m){
            System.out.print(a[i] + " ");
            i++;
        }
         while(j<n){
             System.out.print(b[j] + " ");
            j++;
        }
    }
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();     // Enter the Size of 1st array
        int[] a = new int[m];
        for (int i=0;i<m;i++){
            a[i]=sc.nextInt();  // Enter elements inside the 1st array
        }
        int n = sc.nextInt();   // Enter the Size of 2nd array
        int[] b = new int[n];
        for (int i=0;i<n;i++){
            b[i]=sc.nextInt();  // Enter elements inside the 2nd array
        }
        merge(a,b);
    }
}
