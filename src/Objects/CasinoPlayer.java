package Objects;

public class CasinoPlayer {
	
	public String name = "";
	public double balance;
	public int random;
	public double bet = 0;
	private double balanceChecker;
	
	//constructors
	public CasinoPlayer() {
		name = "player";
		balance = 0.0;
	}
	
	public CasinoPlayer(String playerName, double playerBalance) {
		name = playerName;
		balance = playerBalance; 
	}
	
	//accessor methods
	public double getBalance() {
		return balance;
	}
	
	public String getName() {
		return name;
	}
	
	public double getBet() {
		return bet;
	}
	
	//mutator methods
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	
	public void setName(String inputName) {
		name = inputName;
	}
	
	//methods
	
	public void betAmount(double currentBet) {
		bet = currentBet;
		checkBet();
	}
	
	public void deposit (double amount) {
		balance += amount;
		if (balance > 1000) {
			System.out.println("Your account can only hold $1000");
			balance -= amount;
		}
		System.out.println("Your balance is $" + balance);
	}
	
	public void withdraw (double amount) {
			balance -= amount;
			balanceChecker = amount;
			checkBalance();		
	}
	
	
	public void randomGenerator(int low, int high) {
		random = (int)(Math.random()*((high-low) + 1) + low);
		
	}
	
	
	//private Checks
	private void checkBet() {
		if ((balance - bet) >= 0 && bet <= 100000) {
			balance -= bet;
			System.out.println("Bet placed");
		}
		else if (bet > 100000) {
			System.out.println("**Bet too high** \nBet again");
			bet = 0;
		}
		else if ((balance - bet) < 0) {
			System.out.println("**No negative bets**\nBet again");
			bet = 0;
		}
		else{
			System.out.println("Error");
		}
	}
	
	private void checkBalance() {
		if (balance < 0) {
			balance += balanceChecker;
			balanceChecker = 0;
			System.out.println("Negative withdraw");
		}
		
	} 
}
