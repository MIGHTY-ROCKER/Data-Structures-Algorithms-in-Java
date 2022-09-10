// Input: Sundar
// Output: u a


import java.util.Scanner;
public class VowelFinder {
	static void vowellChecker(String str){
        char[] a = str.toCharArray();
        for(int i = 0; i<a.length; i++){
            if(a[i]=='a' || a[i]=='e' || a[i]=='i' || a[i]=='o' || a[i]=='u' || a[i]=='A' || a[i]=='E' || a[i]=='I' || a[i]=='O' || a[i]=='U'){
                System.out.print(a[i]+" ");
            }
        }
    }
    public static void main(String args[]) {
     Scanner input = new Scanner(System.in);
     String str = input.next();
     vowellChecker(str);
    }
}
