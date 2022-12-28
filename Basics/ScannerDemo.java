import java.util.Scanner;
public class ScannerDemo{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//methods for input...
		//input.nextByte() : take a byte input
		//input.nextInt()  : takes integer input
		//input.nextFloat(): takes float input
		//input.next()     : takes a string input in tokens
		//input.nextLine() : takes a string input until '\n'
		
		System.out.println("Enter your age: ");
		int age = input.nextInt();
		System.out.println("Age: "+age+"\nEnter height: ");
		System.out.println("Height: "+input.nextFloat());
		
		System.out.println("Enter your name");
		input.nextLine(); //since last input statement picked float token from input, '\n' character is still in buffer..
		String name = input.nextLine();
		System.out.println("Name : "+name);
		
		
	}
}