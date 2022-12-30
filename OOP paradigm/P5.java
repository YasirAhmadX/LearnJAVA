//Single level inheritance
//  [ ]
//   |
//  [ ]

class Shape{
	public void area(){
		System.out.println("Area: ");
	}
}

class Triangle extends Shape{
	public void area(int l, int h){
		System.out.println(l*h*(1/2));
	}
}

public class P5{
	public static void main(String[] args){
		
	}
}
	