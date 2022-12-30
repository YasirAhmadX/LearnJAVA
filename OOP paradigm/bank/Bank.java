package bank ;

//access modifiers
/*
*public 	data/methods can be accessed by anyone
*private	can't be accessed outside of class
*protected	data/member can be accessed anywhere in package, and only by sub class when package is imported
*default	by default all data/member and can be accessed only inside the package
*/

class Account{
	public String name; //name of account holder
	protected String email;
	private String password;
	
	//setter
	public void setPassword(String pswd){
		this.password = pswd;
	}
	//getter
	
	public String getPassword(){
		return this.password;
	}		
	
}

public class Bank{
	public static void main(String[] args){
		Account acc1 = new Account();
		acc1.name = "Gus Fring";
		acc1.email = "gus.fring@hermanos.com";
		//acc1.password cannot be accessed in similar way
		//getters are used to fetch privates, setters to set them
		
		acc1.setPassword("meth");
		System.out.println(acc1.getPassword());
		
		
		
	}
}