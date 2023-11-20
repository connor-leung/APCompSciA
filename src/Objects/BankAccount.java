package Objects;

public class BankAccount {
	
	//A static variable (or class variable)
	//applies to the entire class, not any single object
	public static double inRate; 
	public static int numAccts = 0;
	
	
	private double balance = 0.0;
	public String accountName;
	//public means other classes can access the variable
	//private means only this class can access the variable
	
	//A constructor allows a default value
	//By default, a constructor with no parameters is created
	public BankAccount() {
		System.out.println("Adam Michael Allen");
		numAccts++;
	}
	
	public BankAccount(String initialName, double initialBalance) {
		System.out.println("Bank account with parameters");
		numAccts++;
		balance = initialBalance;
		accountName = initialName;
	}
	
	public BankAccount(int bankNumber) {
		numAccts++;
	}
	
	public static int getNumAccts () {
		//it doesnt make sense to allow all bankaccounts to access all bank numbers
		return numAccts;
	}
	
	public void BannedClients() {
		System.out.println("?????");
	}
	
	//a method is an action an object can run
	
	//a void method means nothing is returned
	//every method must have void or a return type
	//the variable(s) in the bracket is the parameter
	public void deposit (double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		//vairable scope meaning declaring amount as a double twice because they are used in different areas
		balance -= amount;
		if (balance < 0) System.out.println("Overdrawn.");
	}
	
	//an accessor method is a method to return a specific value
	public double getBalance() {
		return balance;
	}

	
	//a mutator method is a method to change a specific value
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	
	//precondition: what must be true before the method is run
	//postcondition: what will happen after the method is run
	
	//precondition: rate >= 0, time >= 0
	//postcondition: calculates simple interest
	
	public double calculateInterest(double rate, double time) {
		double interest = balance * rate * time;
		return interest;
	}
	
	
	public double predictInterest(double principal, double rate, double time) {
		double predicted = principal * this.calculateInterest(rate, time);
		//can use a method within a method
		return predicted;
	}
	
	public String toString() {
		return accountName + "'s balance is " + this.getBalance();
		//by putting "" makes the entire thing into a string
		//this referers to the object it belongs to
		//if no string, null will be printed
	}
	
	//A static method is a method that is only applicable to a class
	//It does not require an object to run
	//Typically, static methods are utilities (eg. Math.sqrt)
	
	public static void BankInfo() {
		System.out.println("Info About Washing Hands Bank");
	}	
	
	
	
	
}
