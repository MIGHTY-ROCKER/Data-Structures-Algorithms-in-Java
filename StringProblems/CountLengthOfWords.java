/*
  Count the no of letters in the words of the given input
  
  Intput: Hi I am Alexa
  Output: Hi - 2
          I - 1
          am - 2
          Alexa - 5
          
*/

import java.util.Scanner;

public class CountLengthOfWords {
	 public static void main(String args[]) {
	     Scanner input = new Scanner(System.in);
	     String str = input.nextLine();
	     count(str);
	    }
	 static void count(String str) {
		 for(String s: str.split(" ")) {
			 System.out.println(s + " - " + s.length());
		 }
	 }
}
