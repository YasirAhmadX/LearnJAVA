package implementations;

import java.util.Scanner;
import java.util.Arrays;
public class BubbleSort {
   public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number of elements in array: ");
    int n = input.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++){
        arr[i] = input.nextInt();
    }

    System.out.println(Arrays.toString(arr));

    for(int i=0; i<n-1; i++){
        for(int j=0; j<n-i-1; j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    System.out.println(Arrays.toString(arr));
    input.close();
   } 
}
