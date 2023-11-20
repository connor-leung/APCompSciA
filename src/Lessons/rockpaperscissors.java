package Lessons;
import java.util.Scanner;

public class rockpaperscissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int choice;
		int games;
		int wins = 0;
		int loss = 0;
		int tie = 0;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("What is your name? \nEnter name here: ");
		String name = scan.nextLine();
		System.out.println("Welcome to Rock-Paper-Scissors " + name + "! \nHow many games do you want to play?\nEnter here: ");
		games = scan.nextInt();	
		
		System.out.println("Please enter rock(1), paper(2), or Scissors(3)");
		choice = scan.nextInt();
		
		for (int i = 0; i < games; i++) {
			int compchoice = (int)(Math.random()*(3-1)+1);
			if (compchoice == 1) System.out.println("Computer picked rock");
			if (compchoice == 2) System.out.println("Computer picked paper");
			if (compchoice == 3) System.out.println("Computer picked scissors");
			if (choice == compchoice) {
				System.out.println("Tie");
				tie++;
			}
			else if (choice == 1 && compchoice == 3) {
				System.out.println("You win!");
				wins++;
			}
			else if (choice == 2 && compchoice == 1) {
				System.out.println("You win!");
				wins++;
			}
			else if (choice == 3 && compchoice == 2) {
				System.out.println("You win!");
				wins++;
			}
			else {
				System.out.println("You lose");
				loss++;
			}
			if (i == games - 1) break;
			System.out.println("Please enter rock(1), paper(2), or Scissors(3)");
			choice = scan.nextInt();
		}
		System.out.println("Game Statistics");
		System.out.println("Wins: " + wins);
		System.out.println("Losses: " + loss);
		System.out.println("Ties: " + tie);
		
	}

}
