import java.util.Scanner;

public class NestedForAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + "/" + j + " = " + ((double)i/j));
			}
		}
		
//		int sum = 0;
//		Scanner scan = new Scanner (System.in);
//		System.out.println("Pick an integer");
//		int num1 = scan.nextInt();
//		System.out.println("Pick another integer but smaller than the first one");
//		int num2 = scan.nextInt();
//	
//		for (int i = num2; i <= num1; i++) {
//			for (int j = 1; j < i; j++) {
//				if (i % j == 0) {
//					sum += j;
//				}
//				
//			}
//			if (sum == i) {
//				System.out.println("perfect number at " + i);
//				sum = 0;
//			}
//			sum = 0;
//		}
		
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= 5; j++) {
//				System.out.print(i*j + " ");
//			}
//			System.out.println();
//		}
//		
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 5; j >= i; j--) {
//				if (i == j) System.out.print(i);
//				else System.out.print(". ");
//			}
//			System.out.println();
//		}
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter an integer: ");
		int num = scan.nextInt();
		for (int i = 1; i <= num; i++) {
			int sum = 0;
			for (int j = 1; j <= i; j++) {
				sum = j + sum;
			}
			System.out.println(sum);
		}
		
//		for (int i = 9; i >= 0; i--) {
//			for (int k = 9; k >= i; k--) {
//                System.out.print(k);
//            }
//			System.out.println();
//		}
	
		
	}

}
