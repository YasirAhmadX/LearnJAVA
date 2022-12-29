import java.util.Scanner;
public class ThrowingExceptions{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int[] arr = new int[3];
		
		System.out.print("Enter index: ");
		int i = input.nextInt();
		
		try{
			if(i>2 || i<0){
				throw new ArrayIndexOutOfBoundsException();
				}
			else{
			System.out.printf("Enter value at index %d: ",i);
			arr[i] = input.nextInt();
			System.out.println("arr["+i+"] = "+arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e){
			//System.out.println(e.getMessage());
			System.out.println("Index value must be less than 3");
		}finally{
			System.out.println("Adios.");
		}
	}
}
			
			