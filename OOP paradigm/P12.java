class Student{
	String name ; //name of student
	static String school; //String school will be same for all the students in Student class, hence static keyword
}
public class P12 {
    public static void main(String[] args){
        Student.school = "ABCD";
		Student s1 = new Student();
		s1.name = "alex";
		Student s2 = new Student();
		s2.name = "bob";
		System.out.println(s1.school+"\t"+s1.name);
		System.out.println(s2.school+"\t"+s2.name);
    }
}
