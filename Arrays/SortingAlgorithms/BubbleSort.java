// Sorting the array using Bubble Sort Algorithm
// Bubble sort works on the basis of comparing the ith element with i+1th element. If i+1th element is smaller than ith element then the program will swap it.

import java.util.Scanner;

public class BubbleSort{
  static void sort(int a[]){
    int l = a.length;
    int temp;
    for(int i = 0; i<l-1;i++)
      for(int j = i+1; j<l; j++){
        if(a[j]<a[i]){
          temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }
      }
     for(int n : a){
      System.out.print(n + " ");
     }
  }
  public static void main(String[] arga){
    Scanner input = new Scanner(System.in);
    int size = input.nextInt();               // Enter the Size of the array.
    int a[] = new int[size];
    for(int i = 0; i < a.length; i++){
      a[i] = input.nextInt();                 // Enter the elements inside the array.
    }
    sort(a);
  }
}
