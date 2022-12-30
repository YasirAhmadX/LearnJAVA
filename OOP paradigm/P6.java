//multi level inheritance
//  [ ]
//   |
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

class EquilateralTriangle extends Triangle{
	public void area(int l, int h){
		System.out.println(l*h/2);
	}
}

public class P6{
	public static void main(String[] args){
		
	}
}
	