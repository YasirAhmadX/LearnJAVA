import java.util.Arrays;

public class ArraysDemo{
	public static void main(String[] args){
		//        Arrays
		int[] marks = new int[3]; //new keyword 
		marks[0] = 45; //physics
		marks[1] = 46; //maths
		marks[2] = 40; //HUM
		
		System.out.println(marks[2]);
		
		//empty initializations: if not initialized, array elements will have 0, for boolean type it would be false
		
		//length
		System.out.println(marks.length);  //length is an attribute, not method
		
		//sort
		System.out.println(marks[0]);
		Arrays.sort(marks);
		System.out.println(marks[0]);
		
		int[] marks2 = {97,92,94}; //declaration
		
		//toString : turns array into string with ',' delimiter
		System.out.println("marks2 = "+Arrays.toString(marks2));
		
		//  other methods in Arrays are:
		//equals() : Arrays.equals(source1,source2) : returns a boolean
		//copyOfRange() :  Arrays.copyOfRange(source,3,7) : slices arrays and returns it
		//binarySearch() : Arrays.binarySearch(array,SearchElement) : searches of element using Binary Search
		
		//2d arrays
		
		int[][] Marks = {{90,95,98},{94,93,96}};
		
		System.out.println("Student 1: "+Arrays.toString(Marks[0])+"\nStudent 2: "+Arrays.toString(Marks[1]));
		System.out.println(Marks[0][2]); //3rd Marks of 1st student
		System.out.println(Marks[1][1]); //3rd Marks of 1st student

	}
}