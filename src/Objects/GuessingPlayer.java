package Objects;

public class GuessingPlayer extends CasinoPlayer{
	
	public double payout = 0;
	
	public void play(int guess) {
		randomGenerator(1, 10);
		System.out.println("The number is " + random + "\nYour guess was " + guess);
		if (random == guess) {
			balance += bet * 2;
			System.out.println("Winner!");
		}
		else if (Math.abs(guess - random) == 1) {
			balance += bet * 1.5;
			System.out.println("Winner!");
		}
		else {
			System.out.println("Too bad you lose. You lost $" + bet);
		}
		bet = 0;
		System.out.println("Bet again before playing again");
	}
	
	public void deposit(int amount) {
		balance += amount;
		if (balance > 100000) {
			System.out.println("Your account can only hold $100000");
			balance -= amount;
		}
		System.out.println("Your balance is $" + balance);
	}
	
	
}
