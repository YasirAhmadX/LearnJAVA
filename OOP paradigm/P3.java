//Polymorphism

//1.) compile time polymorphism >> method overloading
//many function with same name but different return types, or parameters or number of parameters
class Student{
	String name;
	int age;
	int std;
	
	public void printInfo(String name){
		System.out.println(name);
	}
	public void printInfo(int age){
		System.out.println(age);
	}
	public void printInfo(String name,int age){
		System.out.println("Name: "+name+" |Age: "+age);
	}
}


public class P3{
	public static void main(String[] args){
		Student s1 = new Student();
		s1.name = "Aman";
		s1.age = 18;
		s1.std = 12;
		
		s1.printInfo(s1.name);
		s1.printInfo(s1.name,s1.age);
		s1.printInfo(s1.age);
	}
}
