package Lessons;
import java.util.Scanner;

public class randomtesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num = 123;
//		
//		System.out.println(num/100);
//		System.out.println(num%100/10);
//		System.out.println(num%100%10);
//		
//		int hours = 123;
//		System.out.println(hours/24);
//		System.out.println(hours%24);
		
//		int x = 2;
//		int y = -4;
//		
//		if (y < 0) {
//			x = -x;
//			y = -y;
//			
//		}
//		int z = 0;
//		while (y > 0) {
//			z += x;
//			y--;
//		}
//		System.out.println(z);
		
//		int a = 9;
//		int b = 10; 
//		
//		if ((double) a / b >= 0.9) {
//			System.out.println(true);
//			
//		}
//		
//		else System.out.println(false);
		
//		System.out.println((double) 9 / 10);
		
//		int n = 10;
//		double sum = 0;
		
//		for (int i = 0; i < n; i++) {
//			sum += (double) (1.0 / i);
//		}
		
//		int a = 0;
//		if (a == 0) System.out.println("true");
//		if (a == 0) System.out.println("true");
//		if (a == 0) System.out.println("true");
		
//		System.out.println("<= ");
//		for (int i = 0; i <= 5; i++) {
//			System.out.print(i);
//		}
//		
//		System.out.println("< ");
//		for (int i = 0; i < 5; i++) {
//			System.out.print(i);
//		}
		
		Scanner scan = new Scanner (System.in);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		while (num1 != 5 && num2 != 3) {
			num1 = scan.nextInt();
			num2 = scan.nextInt();
		}
		System.out.println("yes");
		
		
		
		
	}
		
}
