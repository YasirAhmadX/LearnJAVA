public class MethodsDemo{
	public static void A(){
		System.out.println("\tInside A");
	}
	public static void B(){
		System.out.println("\tInside B");
		A();
	}
	public static void main(String[] arg){
		System.out.println("Control:");
		System.out.println("\tInside main");
		A();
		System.out.println("\tInside main");
		B();
		System.out.println("\tInside main");
	}
}