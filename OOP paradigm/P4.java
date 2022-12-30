class Shape{
	String color;
}

class Triangle extends Shape{
	//Triangle class is going to inherit the properties of Shape,i.e. data color
	//Triangle will be  sub-class / child class
	//Shape will be base class/ parent class
}

public class P4{
	public static void main(String[] args){
		Triangle t1 = new Triangle();
		t1.color = "red";
		
	}
}