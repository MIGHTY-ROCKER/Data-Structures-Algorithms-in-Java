// ASCII value printer 
// Input: Sundar
// Output: 621


import java.util.Scanner;
public class MyClass {
    static void vowellChecker(String str){
        char[] a = str.toCharArray();
        int sum = 0;
        for(int i = 0; i<a.length; i++){
            int h = (int) a[i];
            sum = sum+h;
        }
        System.out.println(sum);
    }
    public static void main(String args[]) {
     Scanner input = new Scanner(System.in);
     String str = input.next();
     vowellChecker(str);
    }
}
