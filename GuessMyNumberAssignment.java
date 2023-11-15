import java.util.Scanner;

public class GuessMyNumberAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int high = 0;
		int low = 0;
		int randomnum = (int)(Math.random()*((100-1)+1)+1);
		int guess;
		boolean easymode;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Do you want easy mode? \nType true (like this) if you want easy mode on. \nIf not, type false. \nResponse: ");
		easymode = scan.nextBoolean();
		
		if (easymode == true) {
			System.out.print("Guess a number between 1-100: ");
			guess = scan.nextInt();
			
			for (int timer = 9; timer > 0; timer--) {
				
				if (guess == randomnum) {
					System.out.println("Yay you got the right number!");
					break;
				}
				else if (guess > randomnum) {
					System.out.println("too high"); 
					high++;	
					System.out.println("You are " + Math.abs(guess - randomnum) + " away.");
				}
				else if (guess < randomnum) {
					System.out.println("too low"); 
					low++;	
					System.out.println("You are " + Math.abs(guess - randomnum) + " away.");
				}
				else {
					System.out.println("error");
				}
				
				System.out.print(timer + " Guesses remaining \nGuess a number between 1-100: ");
				guess = scan.nextInt();
			}
		}
		
		else {
			System.out.print("Guess a number between 1-100: ");
			guess = scan.nextInt();
			
			for (int timer = 9; timer > 0; timer--) {
				
				if (guess == randomnum) {
					System.out.println("Yay you got the right number!");
					break;
				}
				else if (guess > randomnum) {
					System.out.println("too high"); 
					high++;	
				}
				else if (guess < randomnum) {
					System.out.println("too low"); 
					low++;	
				}
				else {
					System.out.println("error");
				}
				
				System.out.print(timer + " Guesses remaining \nGuess a number between 1-100: ");
				guess = scan.nextInt();
			}
		}
		
		if (guess == randomnum) {
			System.out.println("Guessing statistics");
			System.out.println("You were over the number " + high + " times");
			System.out.println("You were under the number " + low + " times");
		} 
		else {
			System.out.println("The number was " + randomnum);
			System.out.println("Guessing statistics");
			System.out.println("You were over the number " + high + " times");
			System.out.println("You were under the number " + low + " times");
		}
		
	}

}
