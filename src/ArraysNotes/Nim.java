package ArraysNotes;

import java.util.Scanner;

public class Nim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] game = {1, 2, 3, 4, 5};
		int sum = 0;
		int gameSum = 0;
		int slot = 0;
		int takeAway = 0;
		boolean player1 = true;
		boolean player2 = false;
		boolean win = false;
		Scanner scan = new Scanner (System.in);
		for (int i = 0; i < game.length; i++) {
			sum += game[i];
		}
		System.out.println("The board");
		for (int i = 0; i < game.length; i++) {
			System.out.print(game[i] + " ");
		}
		while(!win) {
			if (player1) {
				for (int i = 0; i < game.length; i++) {
					gameSum += game[i];
				}
				if (gameSum == 0) {
					System.out.println("Player 1 wins!");
					win = true;
					break;
				}
				gameSum = 0;
				System.out.println("\n**Players 1 turn**");
				System.out.println("Pick a row from 1-5: ");
				slot = scan.nextInt();
				while (slot > 5 || slot < 1) {
					System.out.println("Pick a row again from 1-5: ");
					slot = scan.nextInt();
				}
				while (game[slot-1] == 0) {
					System.out.println("Pick another row other that doesnt have 0");
					slot = scan.nextInt();
				}
				slot--;
				System.out.println("Slot " + (slot + 1) + " has " + game[slot]);
				System.out.println("How many do you want to take away: ");
				takeAway = scan.nextInt();
				while (takeAway > game[slot] || takeAway < 1) {
					System.out.println("Invalid Input");
					System.out.println("How many do you want to take away: ");
					takeAway = scan.nextInt();
				}
				game[slot] -= takeAway;
				System.out.println("The board");
				for (int i = 0; i < game.length; i++) {
					System.out.print(game[i] + " ");
				}
				player2 = true;
				player1 = false;
			}	
			if (player2) {
				for (int i = 0; i < game.length; i++) {
					gameSum += game[i];
				}
				if (gameSum == 0) {
					System.out.println("Player 2 wins!");
					win = true;
					break;
				}
				gameSum = 0;
				System.out.println("\n**Players 2 turn**");
				System.out.println("Pick a row from 1-5: ");
				slot = scan.nextInt();
				while (slot > 5 || slot < 1) {
					System.out.println("Pick a row again from 1-5: ");
					slot = scan.nextInt();
				}
				while (game[slot-1] == 0) {
					System.out.println("Pick another row other that doesnt have 0");
					slot = scan.nextInt();
				}
				slot--;
				System.out.println("Slot " + (slot + 1) + " has " + game[slot]);
				System.out.println("How many do you want to take away: ");
				takeAway = scan.nextInt();
				while (takeAway > game[slot] || takeAway < 1) {
					System.out.println("Invalid Input");
					System.out.println("How many do you want to take away: ");
					takeAway = scan.nextInt();
				}
				game[slot] -= takeAway;
				System.out.println("The board");
				System.out.println();
				for (int i = 0; i < game.length; i++) {
					System.out.print(game[i] + " ");
				}
				player1 = true;
				player2 = false;
			}
		}
	}

}
