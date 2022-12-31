import java.util.Scanner;
class Student{
	String name ; //name of student
	static String school; //String school will be same for all the students in Student class, hence static keyword
	
	public static void changeSchool(String r){
		school = r;
	}
}
public class P12 {
    public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
        Student.school = "ABCD";
		Student s1 = new Student();
		s1.name = "alex";
		Student s2 = new Student();
		s2.name = "bob";
		System.out.println(s1.school+"\t"+s1.name);
		System.out.println(s2.school+"\t"+s2.name);
		System.out.print("Name of new school: ");
		Student.changeSchool(input.nextLine()); //class will be called , not objects
		System.out.println(s1.school+"\t"+s1.name);
		System.out.println(s2.school+"\t"+s2.name);
		
    }
}
