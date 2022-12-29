import java.util.Scanner;

public class WhileLoops{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		
		int i = 0;
		
		while (i<=a){
			System.out.println(i);
			i++;
		}
	}
}