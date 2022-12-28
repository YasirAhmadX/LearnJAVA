public class StringsDemo{
	public static void main(String[] arg){
		//Strings operations
		
		//Empty string declaration
		String[] Address = new String[5];
		Address[0] = "I";
		Address[1] = "n";
		Address[2] = "d";
		Address[3] = "i";
		Address[4] = "a";
		
		System.out.println(Address[0]+Address[1]+Address[2]+Address[3]+Address[4]);
		
		//Concatenation
		String name1 = "Alex"; //String declaration
		String name2 = "Rins";
		String name = name1 + name2;
		System.out.println("Name: "+name);
		
		//charAt
		String name4 = "Valentino Rossi";
		System.out.println(name4.charAt(0)); //character at index 0
		
		//length
		System.out.println(name4.length()); // length of the string
		
		//replace
		String X = "abcDefg";
		String x = X.replace('D','d');  //replace parameter 1 with parameter 2
		System.out.println("X = "+X);
		System.out.println("x = "+x);
		
		//substring
		String R = "Alex and Marc";
		System.out.println(R.substring(5,9));  //slicing from parameter 1(inclusive) to parameter 2(exclusive)
		
		//toUpperCase & toLowerCase
		String A = "aBcDeFgHiJ";
		System.out.println(A.toUpperCase());
		System.out.println(A.toLowerCase());
		
		//equals
		System.out.println("YSR".equals("YSR"));
		System.out.println("YSR".equals("ysr"));
		
		//split
		String names = "Alex Rins, Fabio Baghnaia, Marc Marquez, Valentino Rossi ";
		String[] StripNames = names.split(", "); //array of strings
		System.out.println(StripNames[0]+"\n"+StripNames[1]+"\n"+StripNames[2]+"\n"+StripNames[3]);
		
	}
}