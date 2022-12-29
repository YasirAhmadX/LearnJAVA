import java.util.Scanner;
public class MethodsDemo2{
	public static boolean isPrime(int n){
		int i=2;
		boolean r=true;
		if(n<=1){
			r=false;
			return r;
		}
		else{
			for(i=2;i<=(n/2);i++){
				if(n%i==0){
					r=false;
					//break
					return r;
				}
			}
		}
		return r;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		if(isPrime(input.nextInt())){
			System.out.println("It is a prime.");
		}
		else{
			System.out.println("It is a composite number");
		}
	}
}