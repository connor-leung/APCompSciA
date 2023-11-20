package Objects;

public class SavingsAccount extends BankAccount{
	
	//Constructors are not inherited
	//Use super() to inherit constructors
	//any super() constructor call must be first
	//Note: super.method() can inherit from methods
	//If a subclass constructor makes no explicit super() call 
	//then super() is automatically called.
	
	//If a subclass constructor makes an explicit super call with parameters,
	//the super() with no parameters is not called.
	
	//A subclass without a constructor makes an automatic call to a no parameter
	//constructor of the superclass. if no such constructor exists. then an error results.
	//Note Object (the class) contains a no-parameter constructor which is why no error
	//results when a constructor is not defined. 
	
	
	
	public SavingsAccount() {
		System.out.println("hi");
		//super();
//		super("Josh", 1234);
		//putting parameters within super takes the parameters
		//this is called a super explicit call
		//System.out.println("Connor Desmond Emma");
	}
	//if removing the constructor makes it take the 
	//default bank account constructor 
	
	
	public void BannedClients() {
		//super methods are not limited to call order
		super.BannedClients();
		System.out.println("savings accounts banned");
		super.BannedClients();
	}
	
	//extends means it inherits
	
	//Object is the superclass all other classes
	//inherit from
	
	//To override (change) an inherited method, write 
	//the method header and then change the code
	
	public double calculateInterest (double rate, double time) {
		double extra = 1.1;
		return getBalance()*rate * time * extra;
	}
	
	public void premiumSavings() {
		System.out.println("You qualify for premium savings");
	}
	
}
