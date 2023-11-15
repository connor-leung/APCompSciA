import java.util.Scanner;

public class whileloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int michael = 0;
//		while (michael < 10) {
//			System.out.println(michael);
//			michael++; 
//		}
		//for loop with while loop
		
//		int guess;
//		Scanner scan = new Scanner (System.in);
//		System.out.println("Guess: ");
//		guess = scan.nextInt();
//		int counter = 1; 
//		while (guess != 7) {
//			counter++; 
//			System.out.println("Nope Try again");
//			guess = scan.nextInt();
//		}
//		System.out.println("It took you " + counter + " tries.");
		
		//Exercise
		//User enters positive integer
		//when user enters -1
		//give average
		
		int integer;
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter an integer: ");
		integer = scan.nextInt();
		int sum = 0;
		int times = 0;
		while (integer != -1) {
			sum = sum + integer; 
			times++;
			System.out.println("Enter an integer");
			integer = scan.nextInt();
			
		}
		double average = ((double) (sum) / times);
		System.out.println(average);
		
	}

}
