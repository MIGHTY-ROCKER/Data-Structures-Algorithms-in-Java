// This program will count the number of words in a sentence depends on the space " " between each words.
// Input: "I am not in Danger Skyler, I am the Danger"
// Output: 10


import java.util.Scanner;
public class MyClass {
    static void count(String str){
        char[] a = str.toCharArray();
        int c = 0;
        if(a[0] != ' ')
            c = 1;
        for(int i = 0; i<a.length; i++){
           if(a[i] == ' ' && a[i+1] != ' '){
               c++;
           }
        }
        System.out.println(c);
    }
    public static void main(String args[]) {
     Scanner input = new Scanner(System.in);
     String str = input.nextLine();
     count(str);
    }
}
