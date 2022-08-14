/* This code will only work for finding only one non duplicate element in an array. Multiple non duplicate elements can't be found. */

public class NonDupe {
	public static void main(String[] args){
		int[] array = {5, 1, 3, 1, 7, 3, 7, 12, 5};
		System.out.print(check(array));
	}
	static int check(int[] array){
		int find = 0;
		
		for(int n : array) {
			find ^= n;
		}
		return find;
	}
}

/* Initially find = 0
 * By using for each loop, find value will keeps changing.
 *
 *      0 ^ 5 = 5
 * 			5 ^ 1 = 4
 * 			4 ^ 3 = 7
 * 			7 ^ 1 = 6
 * 			6 ^ 7 = 1
 * 			1 ^ 3 = 2
 * 			2 ^ 7 = 5
 * 			5 ^ 12 = 9
 * 			9 ^ 5 = 12
 * 
 * Output will be 12 */
