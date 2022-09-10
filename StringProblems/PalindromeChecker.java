// Input: "Malayalam"
// Output: Given Input is a Palindrome

// Input: "Rocker"
// Output: Given Input is not a Palindrome

import java.util.Scanner;
public class PalindromeChecker {
    static void check(String str){
        char[] a = str.toCharArray();
        boolean flag = false;
        int i = 0;
        int j = a.length-1;
        while(i<j){
            if(a[i] == a[j]){
                flag = true;
            }
            i++;
            j--;
        }
        if(flag){
            System.out.println("Given Input is a Palindrome");
        }
        else{
            System.out.println("Given Input is not a Palindrome");
        }
    }
    public static void main(String args[]) {
     Scanner input = new Scanner(System.in);
     String str = input.next();
     check(str);
    }
}
