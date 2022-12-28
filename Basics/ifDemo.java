import java.util.Scanner;
public class ifDemo{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter you're age: ");
		int userAge = input.nextInt();
		if( userAge < 0 || userAge > 100){
			System.out.println("Invalid Age!");
		}
		else if( userAge < 18){
			System.out.println("Underage\nCannot vote!");
		}
		else{
			System.out.println("Adult\nYou can vote!!");
		}
	}
}