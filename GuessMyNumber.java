import java.util.Scanner;

public class GuessMyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int randomnum;
		System.out.print("Guess a number between 1-10: ");
		Scanner scan = new Scanner (System.in);
		int guess = scan.nextInt();
		
		randomnum = (int)(Math.random()*((100-1)+1)+1);
		
		if (guess == randomnum) {
			System.out.println("Yay you got the right number!");
		}
		else if (guess > randomnum) System.out.println("too high");
		else if (guess < randomnum) System.out.println("too low");
		else System.out.println("You were " + Math.abs(randomnum-guess) + " away."+ " The number was " + randomnum);
		
	}

}
