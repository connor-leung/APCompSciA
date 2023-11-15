//import java.util.Scanner;
//
//public class ForLoopsAssignment {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		for (int i = 99; i >= 1; i+=-2) {
//			System.out.print(i + " ");
//		}
//		
//		for (int i = 1; i <= 100; i++) {
//			if (i % 12 == 0) {
//				System.out.println(i);
//			}	
//		}
//		
//		for (int i = 500; i <= 1000; i++) {
//			if (i % 10 == 0) {
//				System.out.println((double) i);
//			}
//			else System.out.println(i);
//		}
//		
//		int num;
//		System.out.print("Enter an integer smaller than 10: ");
//		Scanner scan = new Scanner (System.in);
//		num = scan.nextInt();
//		
//		for (int i = 100; i >= 0; i--) {
//			if (i == num) {
//				System.out.println(i);
//				break;
//			}
//			else System.out.println(i);	
//		}
//		
//		int num1;
//		int num2;
//		System.out.print("Enter the bigger integer: ");
//		Scanner scan = new Scanner (System.in);
//		num1 = scan.nextInt();
//		System.out.print("Enter the smaller integer: ");
//		num2 = scan.nextInt();
//		
//		for (int i = num1; i >= num2; i--) {
//			System.out.println(i);
//		}
//		
//		int num1;
//		int num2;
//		System.out.print("Enter the first integer: ");
//		Scanner scan = new Scanner (System.in);
//		num1 = scan.nextInt();
//		System.out.print("Enter the second integer: ");
//		num2 = scan.nextInt();
//		
//		for (int i = 1; i <= 100; i++) {
//			if (i == num1 || i == num2) System.out.print("");
//			else System.out.println(i);
//		}
//		
//		Scanner scan = new Scanner (System.in);
//		System.out.print("Enter a number: ");
//		int num = scan.nextInt();
//	
//		boolean isPrime = true;
//		
//		for (int i = 2; i < num; i++) {
//			if (num % i == 0) isPrime = false;
//		}
//		if (isPrime) System.out.println("Prime");
//		else System.out.println("Not Prime");
//		
//		int sum = 0;
//		Scanner scan = new Scanner (System.in);
//		System.out.print("Enter a number: ");
//		int num = scan.nextInt();
//		
//		for (int i = 1; i <= num; i++) {
//			sum = i + sum;
//		}
//		System.out.println(sum);	
//		
//		Scanner scan = new Scanner (System.in);
//		System.out.print("Enter a small integer: ");
//		int num = scan.nextInt();
//		
//		int factorial = 1;
//		
//		for (int i = 1; i <= num; i++) {
//			
//			factorial *= i;
//		
//		}
//		System.out.println(factorial);
//		
//		for (int i = 500; i <= 1000; i++) {
//			if (i % 5 == 0 && i % 12 == 0) System.out.println(i + "Z");
//			else if (i % 12 == 0) System.out.println(i + "Y");
//			else if (i % 5 == 0) System.out.println(i + "X");
//			else System.out.println(i);
//		}
//		
//		int sum = 0;
//		Scanner scan = new Scanner (System.in);
//		System.out.print("Enter an integer: ");
//		int num = scan.nextInt();
//		
//		for (int i = 1; i <= num; i++) {
//			if (sum == num) {
//				System.out.println("Perfect number");
//				break;
//			}
//			if (num % i == 0) {
//				sum = i + sum;
//			}
//		}
//		if (sum == num) System.out.print("");
//		else System.out.println("Not a perfect number");
//		
//		int num1;
//		int num2;
//		System.out.print("Enter the first integer: ");
//		Scanner scan = new Scanner (System.in);
//		num1 = scan.nextInt();
//		System.out.print("Enter the second integer: ");
//		num2 = scan.nextInt();
//		
//		for (int i = num1; i >= 1; i--) {
//			if (num1 % i == 0 && num2 % i == 0) {
//				System.out.print(i);
//				break;
//			}
//		}
//	}
//
//}
