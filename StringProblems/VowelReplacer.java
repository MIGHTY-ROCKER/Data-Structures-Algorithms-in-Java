// This Program Replaces '$' in the place of vowels
// Input: Sruthi
// Output: Sr$thi$

import java.util.Scanner;
public class MyClass {
    static void vowelReplacer(String str){
        char[] a = str.toCharArray();
        for(int i = 0; i<a.length; i++){
            if(a[i]=='a' || a[i]=='e' || a[i]=='i' || a[i]=='o' || a[i]=='u' || a[i]=='A' || a[i]=='E' || a[i]=='I' || a[i]=='O' || a[i]=='U'){
                a[i] = '$';
            }
        }
        for(char c: a){
            System.out.print(c + " ");
        }
    }
    public static void main(String args[]) {
     Scanner input = new Scanner(System.in);
     String str = input.next();
     vowelReplacer(str);
    }
}
