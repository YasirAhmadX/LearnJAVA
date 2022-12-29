import java.util.Scanner;
public class HandleExceptions{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = input.nextInt();
		System.out.print("Enter b: ");
		int b = input.nextInt();
		//System.out.print("a/b = "+ a/b); //this statement will cause exception when b==0
		try{
			System.out.println("a/b = "+a/b);
		}catch(Exception ArithmeticException){
			System.out.println("Cannot divide by 0");
		}
	}
}
