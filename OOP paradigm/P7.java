//Hierarchy level inheritance
//  []
//  /\
//[]  []

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

class Circle extends Shape{
	public void area(int r){
		System.out.println(3.1415*r*r);
	}
}

public class P7{
	public static void main(String[] args){
		
	}
}
	