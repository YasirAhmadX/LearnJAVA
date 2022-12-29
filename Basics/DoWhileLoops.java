import java.util.Scanner;
public class DoWhileLoops{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int a;
		//Take inputs until user enters negative numbers
		do{
			System.out.print("Enter a number: ");
			a = input.nextInt();
			System.out.println("a = "+a);
		}while(a>=0);
		System.out.println("THE END!!!");
	}
}