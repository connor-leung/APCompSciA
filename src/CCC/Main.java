package CCC;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int counter = 0;
		int n = scan.nextInt();
		
		for (int i = n; i >= 0; i-=5) {
			if (i % 4 == 0 && i > 0) {
				counter++;
			} 
			if (i == 0) counter++;
		}
		
		System.out.println(counter);
		
	}

}