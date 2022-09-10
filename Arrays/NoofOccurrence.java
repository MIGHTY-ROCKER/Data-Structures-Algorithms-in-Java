/* It is a technique of finding number of occurance of each number in an array using hashing technique. 
  By this method negative numbers in the array can also be printed
*/

public class NoofOccurrence {
    static int max(int[] a){
        int n = a.length;
        int max = a[n-1];
        for(int i = n-1; i>= 0; i--){
            if(a[i]>max){
                max = a[i];
            }
        }
        return max;
    }
    static int min(int[]a){
        int min = a[0];
        for(int i =1; i<a.length;i++){
            if(a[i]<min){
                min = a[i];
            }
        }
        return min;
    }
    static void hash(int[] a){
        int n = a.length;
        int max = max(a);
        int min = min(a);
        int y = -min;
        int b[] = new int[max+1+y];
        for(int i =0; i<max+1;i++) {
        	b[i] =0;
        }
        for(int i = 0; i<n; i++){
            int x = a[i];
            b[x+y]++;
        }
        for(int i =0; i<=max+1; i++){
            if(b[i]!=0){
                System.out.println(i-y +" "+ b[i]);
            }
        }
    }
    public static void main(String args[]) {
        int a[] = {3, 2, 4, 2, -1, 6, 5, 8}; 
        hash(a);
    }
}
