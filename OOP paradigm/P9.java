//abstraction
abstract class Animal{   //abstract is also a class which serves only as a blueprint for creation of other classes but cannot be used 
    abstract void walk();
    public void eat(){
        System.out.println("animal eats");
    }

}

class Horse extends Animal{
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}

public class P9{
    public static void main(String[] args){
        Horse A = new Horse();
        A.walk();
        A.eat();

        //Animal b = new Animal(); //this will cause error as abstract class cannot be instantiated/created.

    }
}