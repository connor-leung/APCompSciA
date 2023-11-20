package Lessons;
import java.util.Scanner;
//lazy way uses a * after util.  

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Memorizing input code is NOT necessary
		//however, knowing the concept of input
		//is necessary 
		
		int num;
		System.out.print("Enter an integer: ");
		Scanner scan = new Scanner (System.in);
//		//Dont need to know for test rn Scanner is a class and scan is an object
		num = scan.nextInt();
		System.out.println("You entered " + num);
		//to enter doubles
		//scan.nextDouble()
		//to enter Strings
		//scan.nextLine()
		
		//What could be on the AP or my quiz
		// num = //input from user
		// Assume the user enters an integer, num
		
		//Exercise
		//Ask the user to enter 3 different integers
		//Print out the largest.
		
		int num1;
		int num2;
		int num3;
		System.out.print("Enter the 1st integer: ");
		num1 = scan.nextInt();
		
		System.out.print("Enter the 2nd integer: ");
		num2 = scan.nextInt();
		
		System.out.print("Enter the 3rd integer: ");
		num3 = scan.nextInt();
		
		if (num1 > num2 && num1 > num3) System.out.println(num1 + " is the largest");
		else if (num2 > num3) System.out.println(num2 + " is the largest");
//		//doesnt need to check num1 is greater because it already checks it
		else System.out.println(num3 + " is the largest");
//		//doesnt need to check anything
		
		
		//Exercise 2 
		//Generate a random number but don't tell the user 
		//Ask the user to guess the number
		//Tell the user how far they are away from the number
		
		
		int randomnum;
		System.out.print("Guess a number between 1-10: ");
		int guess = scan.nextInt();
		
		randomnum = (int)(Math.random()*((10-1)+1)+1);
		
		if (guess == randomnum) System.out.println("Yay you got the right number!");
		else System.out.println("You were " + Math.abs(randomnum-guess) + " away."+ " The number was " + randomnum);
		
	}

}
