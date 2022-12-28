public class MathDemo{
	public static void main(String[] args){
		//Math.max(a,b): returns maximum among a and b
		System.out.println(Math.max(45,62));
		System.out.println(Math.min(45,62)); //Similar to max, this returns minimum among a and b
		
		//Math.random() : Generates random number from 0 to 1
		System.out.println(Math.random());
		System.out.println((int)(Math.random()*100)); //to generate random number from 0 to 100
	}
}