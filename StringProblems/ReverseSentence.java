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

/* Alternate Approach

public class ReverseSentence {
    public static String reverseWords (String s) { 
        String result = new String();
        int i = 0;
        int n = s.length();

        while(i < n){

            while(i < n && s.charAt(i) == ' ') i++;

            if(i >= n) break;

            int j = i + 1;

            while(j < n && s.charAt(j) != ' '){
                j++;
            }  
            String sub = s.substring(i, j);

            if(result.length() == 0) result = sub;
            else result = sub + " " + result;

            i = j + 1;

        }
        return result;
    }
    public static void main(String[] args){
        String s = "  How are you  ";
        System.out.println(reverseWords(s));
    }
}

// Time Complexity O(n^2)
*/
