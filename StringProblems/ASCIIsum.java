// Sum of ASCII value of the characters in the given string
// Input: Sundar
// Output: 621


import java.util.Scanner;
public class ASCIIsum {
    static void sumASCIIvalue(String str){
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
     sumASCIIvalue(str);
    }
}
