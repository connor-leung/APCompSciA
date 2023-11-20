package Objects;

public class RoulettePlayer extends GuessingPlayer {
	
	public void randomGenertator(int low, int high) {
		low = 1;
		high = 39;
	}
	
	//exact number
	public void play(int guess) {
		randomGenerator(1, 39);
		System.out.println("The number is " + random + "\nYour guess was " + guess);
		if (guess == random) {
			System.out.println("Winner!");
			balance += bet * 5;
			System.out.println("You have won $" + bet * 5);
		}
		else {
			System.out.println("Too bad you lose. You lost $" + bet);
		}
		bet = 0;
		System.out.println("Bet again before playing again");
	}
	
	//range of numbers
	public void play(int lowguess, int highguess) {
		randomGenerator(1, 39);
		System.out.println("The number is " + random + "\nYour guess was " + lowguess + "-" + highguess);
		if (lowguess <= random && random <= highguess) {
			System.out.println("Winner!");
			balance += bet * 2;
			System.out.println("You have won $" + bet * 2);
		}
		else {
			System.out.println("Too bad you lose. You lost $" + bet);
		}
		bet = 0;
		System.out.println("Bet again before playing again");
	}
	
	//even or odd
	public void play(String oddOrEven) {
		randomGenerator(1, 39);
		System.out.println("The number is " + random + "\nYour guess was " + oddOrEven);
		String wordguess = oddOrEven.toUpperCase();
		if (wordguess.indexOf("ODD") == 0 && random % 2 > 0) {
			balance += bet * 1.5;
			System.out.println("Winner!");
			System.out.println("You have won $" + bet * 1.5);
		}
		else if (wordguess.indexOf("EVEN") == 0 && random % 2 == 0) {
			balance += bet * 1.5;
			System.out.println("Winner!");
			System.out.println("You have won $" + bet * 1.5);
		}
		else {
			System.out.println("Too bad you lose. You lost $" + bet);
		}
		bet = 0;
		System.out.println("Bet again before playing again");
	}
	
	public static void odds() {
		System.out.println("Statistics for even or odd: 48.60%\n");
		System.out.println("Statsitics for exact number: 2.60%\n");
		System.out.println("Statistics for range of 13 numbers: 33.33%");
	}
	
	
	
}
