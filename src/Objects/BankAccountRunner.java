package Objects;

public class BankAccountRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SavingsAccount josh = new SavingsAccount();
		
		BankAccount jack = new BankAccount();
		BankAccount adam = new BankAccount();
		BankAccount michael = new BankAccount("Michael", 9.75);
		//stuff inside the brackets is called a parameter
		SavingsAccount allen = new SavingsAccount();
		
		allen.getBalance();
		
		jack.BannedClients();
		allen.BannedClients();
		
		allen.deposit(0);
		allen.setBalance(10);
		allen.calculateInterest(1.0, 1);
		allen.premiumSavings();
		
		//jack "is-a" bank account and does not have
		//access to SavingsAccount methods
		//jack.premiumSavings(); is an error
		
		//allowed
		BankAccount connor = new SavingsAccount();
		//rule:
		//not allowed
		//SavingsAccount connor = new BankAccount();
		
		//connor.premiumSavings();
		//cannot run because premiumSavings is in SavingsAccount
		//but NOT in BankAccount
		
		connor.deposit(5.0);
		//connor can access BankAccount methods
		
		connor.calculateInterest(1.0, 1);
		//allowed because calculateInterest was overwritten
		//by SavingsAccount
		
		//to call a method, use dot
		//same as Math.sqrt
		jack.deposit(5.25);
		jack.deposit(1.25);
		jack.deposit(0.25);
		adam.deposit(10.20);
		
		//Math.sqrt(4.0); doesnt show anything because it isnt printed or stored
		//therfore we have to print getBalance to have it do smt
		
		System.out.println(jack.getBalance());
		System.out.println("Michael's balance " + michael.getBalance());
		
		double jackinterest = jack.calculateInterest(0.05, 1);
		System.out.println("Jack interest is " + jackinterest);
		
		michael.getNumAccts();
		
		System.out.println(michael);
		System.out.println(adam);
		BankAccount.BankInfo();
		System.out.println("Number of accounts: " + BankAccount.getNumAccts());
		
		
	}

}