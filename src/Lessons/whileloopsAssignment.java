package Lessons;
import java.util.Scanner;

public class whileloopsAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i = 1000;
//		while (i >= 500) {
//			System.out.println(i);
//			i--;
//		}
		
//		int i = 100;
//		while (i <= 200) {
//			if (i % 2 == 0)System.out.println(i);
//			i++;
//		}
		
//		int i = 15;
//		while (i <= 75) {
//			if (i % 15 == 0) System.out.println(i);
//			i++;
//		}
		
//		Scanner scan = new Scanner (System.in);
//		System.out.println("Enter a number");
//		int num = scan.nextInt();
//		int run = 0;
//		while (num > 1) {
//			num = num/2;
//			run++;
//		}
//		System.out.println(run);
		
//		int integer;
//		Scanner scan = new Scanner (System.in);
//		System.out.println("Enter an integer: ");
//		integer = scan.nextInt();
//		int sum = 0;
//		int times = 0;
//		while (integer != -1) {
//			sum = sum + integer; 
//			times++;
//			System.out.println("Enter an integer");
//			integer = scan.nextInt();
//		}
//		double average = ((double) (sum) / times);
//		System.out.println(average);
		
//		double sum = 0;
//		int i = 1;
//		Scanner scan = new Scanner (System.in);
//		System.out.println("Enter Number");
//		double num = scan.nextDouble();
//		while (i < 5) {
//			sum = sum + num;
//			i++;
//			System.out.println("Enter Number");
//			num = scan.nextDouble();
//		}
//		System.out.println(sum);
		
//		int attempts = 0;
//		Scanner scan = new Scanner (System.in);
//		System.out.println("Enter a 4 digit number");
//		int num = scan.nextInt();
//		while (num != 3924) {
//			System.out.println("Enter a 4 digit number");
//			num = scan.nextInt();
//			attempts++;
//		}
//		System.out.println("number of attempts: " + attempts);
		
		int attempts = 0;
		int i = 1;
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a 4 digit number");
		int num = scan.nextInt();
		while (i < 5) {
			if (num == 3924) {
				System.out.println("Correct! It only took " + attempts + " attempts!");
				break;
			}
			else {
				System.out.println("Enter a 4 digit number");
				num = scan.nextInt();
				attempts++;
				i++;
			}
		}
		if (i == 5) System.out.println("account locked");
		
	}

}
