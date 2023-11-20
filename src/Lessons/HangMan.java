package Lessons;
import java.util.Scanner;

public class HangMan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		String wrongs = "";
		boolean correct = false;
		boolean wordright = false;
		boolean lose = false;
		boolean win = false;
		int misses = 0;
		int counter = 0;
		
		System.out.println("Rules: \nOnly type letters unless you want to guess the word. \nAll guesses are lower case. \nTo guess the word, type the entire word in the guess box");
		
		System.out.println("\nEnter the secret word:");
		String secret = scan.nextLine();
		secret = secret.toLowerCase();
		
		//printing how many letters are in the word
		String reveal = "";
		for (int i = 0; i < secret.length(); i ++) {
			reveal += "-";
			counter++;
		}
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nThe word is " + counter + " long.\n" + reveal);
		

		while (!correct) {		
			System.out.println("\nEnter your guess: ");
			String guess = scan.nextLine();
			
			if (guess.equals(secret)) {
				System.out.println("\nYou guessed the word! \nYay!");
				correct = true;
				break;
			}
			
			//revealing if you got a correct word
			for (int i = 0; i < secret.length(); i++) {
				if (guess.equals(secret.substring(i,i+1))) {
					reveal = reveal.substring(0, i) + guess + reveal.substring(i + 1);
					wordright = true;
					
				}
				else {
					counter++;
				}
			}
			if (counter == secret.length()) wordright = false;

			System.out.println(reveal);
			
			//check for if the word is completely solved
			
			if (wordright) {
				System.out.println("The amount of misses: " + misses + "\nWrong guesses: " + wrongs);
				wordright = false;
			}
			
			else if (!wordright) {
				wrongs += guess + " ";
				misses++;
				System.out.println("List of wrong words: \n" + wrongs + "\nNumber of misses: " + misses);
				if (misses > 26 - secret.length()) {
					//idk if ^ is a good amount of misses
					lose = true;
				}
			} 
			if (lose) {
				System.out.println("Too bad, you lose.");
				System.out.println("The word was: " + secret);
				break;
			}

		}

	}

}
