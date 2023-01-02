package implementations;
import java.util.Scanner;
import java.util.Arrays;
public class SelectionSort {
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
        for(int i=0; i<n; i++){
            int s=i; //smallest element index
            for(int j=i; j<n; j++){
                if(arr[s]>arr[j]){
                    s=j;
                }
            }
            int temp=arr[s];
            arr[s]=arr[i];
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));
        
    }
}
