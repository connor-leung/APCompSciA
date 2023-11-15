import java.util.Scanner;

public class GreedyPigs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalpts1 = 0;
		int totalpts2 = 0;
		int roundpts1 = 0;
		int roundpts2 = 0;
		int continuing1 = 1;
		int continuing2 = 0;
		boolean wincondition = false;
		int rand1 = 0;
		int rand2 = 0;
		Scanner scan = new Scanner (System.in);
		
		while (wincondition != true) {
			
			roundpts1 = 0;
			rand1 = (int)(Math.random()*((6 - 1) + 1)+ 1);
			rand2 = (int)(Math.random()*((6 - 1) + 1)+ 1);
			
			while (continuing1 == 1) {

				System.out.println("\n*Player 1*\nYou have " + totalpts1 + " total points");
				while (rand1 == 6 || rand2 == 6) {
					rand1 = (int)(Math.random()*((6 - 1) + 1) + 1);
					rand2 = (int)(Math.random()*((6 - 1) + 1) + 1);	
				}
				System.out.println("Your roll " + rand1 + ", " + rand2);
				roundpts1 += rand1 + rand2;
				if ((roundpts1 + totalpts1) >= 50) {
					wincondition = true;
					System.out.println("Player 1 wins");
				}
				if(wincondition) break;
				System.out.println("You have " + roundpts1 + " points this round"); 
				System.out.println("Do you want to continue? \nIf yes type 1 for no type 0");
				continuing1 = scan.nextInt();
				while (continuing1 == 1) {
					rand1 = (int)(Math.random()*((6 - 1) + 1) + 1);
					rand2 = (int)(Math.random()*((6 - 1) + 1) + 1);
					System.out.println("\nYour roll " + rand1 + ", " + rand2);
					roundpts1 += rand1 + rand2;
					if (rand1 == 6 && rand2 == 6) {
						roundpts1 = 0;
						continuing1 = 0;
						System.out.println("You lose all your points :(");
						totalpts1 = 0;
						continuing2 = 1;
						}
					else if (rand1 == 6 || rand2 == 6) {
						roundpts1 = 0;
						continuing1 = 0;
						System.out.println("You lose all your points for this round :(");
						continuing2 = 1;
					}
					else if ((totalpts1 + roundpts1) >= 50) {
						wincondition = true;
						break;
					}
					else {
						System.out.println("You have " + roundpts1 + " points this round!");
						System.out.println("Do you want to continue? \nIf yes type 1 for no type 0");
						continuing1 = scan.nextInt();
					}
				}
				totalpts1 += roundpts1;
				System.out.println("You have " + totalpts1 + " total points");
				if (totalpts1 >= 50) {
					break;
				}
				if (continuing1 == 0) {
					continuing2 = 1;
				}
			}
			
			roundpts2 = 0;
			rand1 = (int)(Math.random()*((6 - 1) + 1)+ 1);
			rand2 = (int)(Math.random()*((6 - 1) + 1)+ 1);
			
			while (continuing2 == 1) {

				System.out.println("\n*Player 2*\nYou have " + totalpts2 + " total points");
				while (rand1 == 6 || rand2 == 6) {
					rand1 = (int)(Math.random()*((6 - 1) + 1) + 1);
					rand2 = (int)(Math.random()*((6 - 1) + 1) + 1);	
				}
				
				System.out.println("\nYour roll " + rand1 + ", " + rand2);
				roundpts2 += rand1 + rand2;
				if ((roundpts2 + totalpts2) >= 50) {
					wincondition = true;
					System.out.println("Player 2 wins");
				}
				if (wincondition) break;
				System.out.println("You have " + roundpts2 + " points this round"); 
				System.out.println("Do you want to continue? \nIf yes type 1 for no type 0. If you have enough points press 0");
				continuing2 = scan.nextInt();
				while (continuing2 == 1) {
					rand1 = (int)(Math.random()*((6 - 1) + 1) + 1);
					rand2 = (int)(Math.random()*((6 - 1) + 1) + 1);
					System.out.println("Your roll " + rand1 + ", " + rand2);
					roundpts2 += rand1 + rand2;
					if (rand1 == 6 && rand2 == 6) {
						roundpts2 = 0;
						continuing2 = 0;
						System.out.println("You lose all your points :(");
						totalpts2 = 0;
						continuing1 = 1;
						}
					else if (rand1 == 6 || rand2 == 6) {
						roundpts2 = 0;
						continuing2 = 0;
						System.out.println("You lose all your points for this round :(");
						continuing1 = 1;
					}
					else if ((totalpts2 + roundpts2) >= 50) {
						wincondition = true;
						break;
					}
					else {
						System.out.println("You have " + roundpts2 + " points this round!");
						System.out.println("Do you want to continue? \nIf yes type 1 for no type 0. If you have enough points press 0");
						continuing2 = scan.nextInt();
					}
				}
				totalpts2 += roundpts2;
				System.out.println("You have " + totalpts2 + " total points");
				if (totalpts2 >= 50) {
					break;
				}
				if (continuing2 == 0) {
					continuing1 = 1;
				}
			}
			if (totalpts2 >= 50) System.out.println("Player 2 wins!");
			if (totalpts1 >= 50) System.out.println("Player 1 wins!");
		}

	}

}


