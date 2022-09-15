/* Delete vowels from the input and place # before consonants also change the case of the consonants in the given word.
  Input: Zoho
   Output: #z#H
   
   Input: Love
   Output: #l#V
*/

public class ReplaceBeforeConsonants {
	static void value(String str) {
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!='a'&&str.charAt(i)!='e'&&str.charAt(i)!='i'&&str.charAt(i)!='o'&&str.charAt(i)!='u') {
				char y=str.charAt(i);
				if(Character.isUpperCase(y)) {
					System.out.print("#");
					System.out.print(Character.toLowerCase(y));
				}
				else {
					System.out.print("#");
					System.out.print(Character.toUpperCase(y));
				}
			}
		}

	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String n = input.next();
		value(n);
		
	}
}
