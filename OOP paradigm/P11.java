//multiple inheritance
interface Animal{
    // propeties will be public , static and final
    int eyes = 2;
    public void walk();
    void eat(); //it is by default abstract and public 
}

interface Herbivore{

}

class Horse implements Animal,Herbivore{
    public void walk(){
        System.out.println("Walks on 4 legs.");
    }
    //not implementing any of the methods of Animal will cause error
    public void eat(){
        System.out.println("Eats grams...");
    }
}

public class P11 {
    public static void main(String[] args){
        Horse h = new Horse();
        h.walk();
        h.eat();
    }
}
