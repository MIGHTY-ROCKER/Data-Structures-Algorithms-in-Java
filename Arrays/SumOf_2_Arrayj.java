/* Given 2 arrays of different sizes 12 and 9
a = {9, 2, 8, 1, 3, 5, 6, 7, 3, 1, 1, 6}
b = {7, 8, 4, 6, 2, 1, 9, 9, 7}
The concept here is to add the elements in the two arrays
Output: 9 2 8 1 3 5 6 7 3 1 1 6
*/

import java.util.Scanner;
public class SumofArrays{
    static void sum(int a[], int b[], int n, int m){
        int c[] = new int[n+2];
        int h=0;
        int i = n-1;
        int j = m-1;
        int carry = 0;
        while(i>=0 && j>=0){
            int o = a[i] +b[j] + carry;
            c[h] = o%10;
            h++;
            carry = o/10;
            i--;
            j--;
        }
        while(i>=0){
            int o = a[i]+carry;
            c[h] = o%10;
            h++;
            carry = o/10;
            i--;
        }
        while(j>=0){
            int o = a[j]+carry;
            c[h] = o%10;
            h++;
            carry = o/10;
            j--;
        }
        if(carry!=0){
            c[h] = carry;
            h++;
        }
        for(int k =h-1; k>=0;k--){
            System.out.print(c[k]+" ");
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();        // Enter the size of array a
        int a[] = new int[n];
        for(int i =0; i<n; i++){
            a[i] = input.nextInt();     // Enter elements inside the array a
        }
        int m = input.nextInt();        // Enter the size of array b
        int b[] = new int[m];
        for(int i =0; i<m; i++){
            b[i] = input.nextInt();     // Enter elements inside the array b
        }
        sum(a,b,n,m);
    }
}
