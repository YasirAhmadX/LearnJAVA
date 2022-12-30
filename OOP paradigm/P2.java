class Student{
	String name;
	int age;
	int std;
	int reprimands;
	
	public void info(){
		System.out.println("Student name:\t"+this.name);
		System.out.println("Student's age:\t"+this.age);
		System.out.println("Student's class:\t"+this.std);
		System.out.println("Reprimands:\t"+this.reprimands);
	}
	public void addFine(int n){
		this.reprimands+=n;
	}
	
	public void birthDay(){
		this.age++;
	}
	//Patameterised constructors
	Student(String n,int a,int s, int r){  
		System.out.println("Constructor called");
		this.name = n;
		this.age = a;
		this.std = s;
		this.reprimands = r;
	}
	/* //copy constructors
	Student (Student s2){...
	...
	}
	Student(){
		
	}
	*/
}

public class P2{
	public static void main(String[] args){
		Student s1 = new Student("Sahil",16,10,0);
		Student s2 = new Student("Sohail",17,11,500);
		s1.info();
		s2.info();
		s1.addFine(1400);
		s2.birthDay();
		s1.info();
		s2.info();
		
	}
}