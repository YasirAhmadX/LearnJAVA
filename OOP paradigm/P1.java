class Dog{
	//attributes....[DATA]
	String name; //tommie, carpet
	//String species; //german shephard
	String barkSound;
	//methods.....[MEMBERS]
	public void Bark(){
		System.out.println(this.barkSound+this.barkSound+this.barkSound);
	}
}

public class P1{
	public static void main(String[] args){
		Dog d = new Dog();  //constructor...non parameterised is automatically generated
		d.name = "carpet";
		d.barkSound = "Bhouw!.";
		Dog a = new Dog();
		a.name = "tomie";
		a.barkSound = "VOww! ";
		System.out.println(d.name);
		d.Bark();
		a.Bark();
		
	}
}
