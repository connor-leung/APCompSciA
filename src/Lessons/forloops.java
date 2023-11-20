package Lessons;
import java.util.Scanner;

public class forloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Next class - boolean quiz
		//next next class - guess my number
		//next week quiz - if, else
		
		//For loops
		//for (start; end; increment)
		
		//Example 1
		//usually i is used as the int
		for (int i=1; i <= 10; i++) {
		//i is only used in the brackets aka as variable scope
			System.out.println("desmond is cool " + i);
		}
		
		//Example 2
		//The increment can be changed
		//The start and end can be changed
		
		//Print all odd numbers from 1 to 99
		for (int i = 1; i <= 99; i += 2) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		//Print all odd from 99 to 1
		for (int i = 99; i >= 1; i+=-2) {
			System.out.println(i + " ");
		}

		
		//Exercise 1
		//Write FizzBuzz
		//Multiple of 3, Fizz, Multiple of 5 Buzz
		//Multiple of both, FizzBuzz
		//Print all other numbers 
		
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0 && i % 3 == 0) {
				System.out.print(" FizzBuzz ");
			}
			else if (i % 5 == 0) {
				System.out.print(" Buzz ");
			}
			else if (i % 3 == 0) {
				System.out.print(" Fizz ");
			}
			else {
				System.out.print(" " + i + " ");
			}
				
		}
		
		//Exercise 2
		//Ask the user for number
		//Print the sum of 1 to that number
		//Example: user enters 5
		//Print out 1 + 2 + 3 + 4 + 5 = 15
		
//		Scanner scan = new Scanner (System.in);
//		System.out.print("Enter an integer: ");
//		int num = scan.nextInt();
//		
//		int sum = 0; 
//		
//		for (int i = 1; i <= num; i++) {
//			sum += i; 
//			
//			if (i == num) {
//				System.out.println(i + " = " + sum);
//				
//			} 
//			else {
//				System.out.print(i + " + ");
//			}
//		
//		}
		
//		System.out.println(sum);
//		
//		Scanner scan = new Scanner (System.in);
//		System.out.print("Enter a small integer: ");
//		int num2 = scan.nextInt();
//		
//		int factorial = 1;
//		
//		for (int i = 1; i <= num2; i++) {
//			
//			factorial *= i;
//		
//		}
//		System.out.println(factorial);
		
		//Exercise 3
		//The user enters an integer
		//Print out whether the integer is a prime number or not
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter a prime number: ");
		int num = scan.nextInt();
	
		boolean isPrime = true;
		
		for (int i = 2; i < Math.sqrt(num); i++) {
			if (num % i == 0) isPrime = false;
			//dont need to know but useful
		}
		
		if (isPrime) System.out.println("Prime");
		//if isPrime true then print
		else System.out.println("Not Prime");
		
	}

}
