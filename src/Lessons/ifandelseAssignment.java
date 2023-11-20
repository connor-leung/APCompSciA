package Lessons;
import java.util.Scanner;

public class ifandelseAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.print("Enter an integer: ");
		Scanner scan = new Scanner (System.in);
		num = scan.nextInt();
		
		if (num >= 100) System.out.println("Greater or equal to 100");
		else System.out.println("Less than 100");
		
		if (num % 3 == 0) System.out.println("Divisible by 3");
		else System.out.println("Not divisible by 3");
		
		if (num % 7 == 0 && num % 5 ==0) System.out.println("Divisable by 5 and 7");
		else if (num % 7 == 0) System.out.println("Divisable by 7");
		else System.out.println("Divisable by 5");
		
		int square = (int) Math.sqrt(num); 
		if (square - Math.sqrt((double) num) == 0) System.out.println("Perfect square");
		else System.out.println("Not a perfect square");
		
		double grade; 
		System.out.print("Enter your grade: ");
//		Scanner scan = new Scanner (System.in);
		grade = scan.nextDouble();
		if(grade >= 86 && grade <= 100) System.out.println("A Grade");
		else if(grade >= 73 && grade < 86) System.out.println("B Grade");
		else if (grade >= 0 && grade < 73) System.out.println("Fail");
		else System.out.println("Error");
		
		
		if (num % 2 == 0 && num + Math.abs(num) > 0) System.out.println("positive even");
		else if (num % 2 == 0 && num + Math.abs(num) == 0) System.out.println("negative even");
		else if (num + Math.abs(num) == 0) System.out.println("negative odd");
		else System.out.println("positive odd");
		
		int capacity;
		int attendance;
		System.out.println("Enter capacity: ");
		System.out.println("Enter attendance: ");
		capacity = scan.nextInt();
		attendance = scan.nextInt();
		if (attendance > capacity) System.out.println("Fire hazard");
		else if ((double) attendance/capacity >= 0.9 && (double) attendance/capacity <= 1) System.out.println("full");
		else System.out.println("entry allowed");
		
		int randomnum = (int) (Math.random()*((100-1)+1)+1);
		System.out.println("Your Number: "+ num + "\nRandom Number: " + randomnum);
		if (num > randomnum) System.out.println("Your number is greater");
		else if (num == randomnum) System.out.println("Numbers are equal");
		else System.out.println("Random Number is Greater");
		
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
		else System.out.println(num3 + " is the largest");
		
//		int num1;
//		int num2;
//		System.out.println("Enter a two digit integer: ");
//		System.out.println("Enter another two digit integer: ");
//		num1 = scan.nextInt();		
//		num2 = scan.nextInt();
//		if (num1 % 10 == num2 % 10) System.out.println("Last digits are equal");
//		else System.out.println("Not equal");
	}

}
