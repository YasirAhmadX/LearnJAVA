public class TypeCasting{
	public static void main(String[] args){
		//casting
		double price = 100.00;
		double finalPrice = price + 18.3;
		
		System.out.println(finalPrice);
		
		int p =100;
		/*
		int fp = p + 18.3;
		*/
		//above statement will cause error cause java does not down type-caste automatically
		//however it can implicit type caste int to float automatically.
		
		// Implicit casting
		float a = p;
		System.out.println(a);
		
		//Explicit casting
		
		p = 100;
		
		int fp = p + (int)18.3;
		
		System.out.println(fp);
	}
}