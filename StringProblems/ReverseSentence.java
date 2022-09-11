// Input: How are you
// Output: you are How
// I splitted words by means of " " as delimiter.

import java.util.Scanner;
public class ReverseSentence {
    static void count(String str){
        String[] a = str.split("\\s");
        for(int i = a.length-1; i>=0; i--){
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String args[]) {
     Scanner input = new Scanner(System.in);
     String str = input.nextLine();
     count(str);
    }
}

// Alternate way to split the string
/* List<String> string = Pattern.compile(" ").splitAsStream(s).collect(Collectors.toList())
    It will convert the string into array list.
    Pattern.compile is in Pattern class.
    Package Names: java.util.regex.Pattern;
    java.util.stream.Collectors
*/
