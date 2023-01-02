package implementations;
import java.util.Scanner;
import java.util.Arrays; 
public class InsertionSort {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements in array: ");
        int n = input.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=input.nextInt();
        }
        input.close();
        System.out.println(Arrays.toString(arr));
        
        for(int i=1; i<n; i++){
            int p=i;
            for(int j=i-1; j>=0; j--){
                if(arr[i]<arr[j]){
                    p=j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[p];
            arr[p] = temp;
            System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }
}
