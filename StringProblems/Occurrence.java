import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Occurrence {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s1 = input.nextLine();
		
		AllIn1String a = new AllIn1String();
		a.count(s1);
		a.occurrence(s1);
	}
	static void count(String s1) {
		int No_of_words = 0;
		int No_of_Vowels = 0;
		int UpperCase = 0;
		for(int i = 0; i<s1.length(); i++) {
			char c = s1.charAt(i);
			
			switch(c) {
			case ' ':
			case '.':
			case ',':
				No_of_words++;
			}
			
			switch(c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				No_of_Vowels++;
			}
			
			if(c >=65 && c<=90)
				UpperCase++;
			 
		}
		System.out.println("Number of words " + " = " + No_of_words);
		System.out.println("Number of Vowels " + " = " + No_of_Vowels);
		System.out.println("Number of Upper Case words " + " = " + UpperCase);
	}
	
	static void occurrence(String s1) {
		TreeMap<Character, Integer> map = new TreeMap<>();
		for(int i = 0; i<s1.length(); i++) {
			Integer c = map.get(s1.charAt(i));
			if(map.get(s1.charAt(i)) == null)
				map.put(s1.charAt(i), 1);
			else
				map.put(s1.charAt(i), ++c);
		}
		for(Map.Entry e: map.entrySet()) {
			System.out.println("Character " + e.getKey());
			System.out.println("Occurrence " + e.getValue());
		}
	}
}
