// This program will count the number of special character in a string
// Input: I L*ve a g!rl n@med Somet#!ng
// Output: 5


import java.util.Scanner;
public class MyClass {
    static void count(String str){
        char[] a = str.toCharArray();
        int count = 0 ;
        for(int i = 0; i<a.length; i++){
           if(a[i] >= 'a' && a[i]<= 'z' || a[i] >= 'A' && a[i]<= 'Z' || a[i] == ' ') {
               count++;
           }
        }
        System.out.print(a.length-count);
    }
    public static void main(String args[]) {
     Scanner input = new Scanner(System.in);
     String str = input.nextLine();
     count(str);
    }
}
