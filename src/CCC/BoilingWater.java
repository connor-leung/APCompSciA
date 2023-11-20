package CCC;

import java.util.Scanner;

public class BoilingWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		int sealevel = 0;
		int B = scan.nextInt();
		int P = 5 * B - 400;
		
		if (P < 100) {
			sealevel = -1;
		}
		if (P > 100) {
			sealevel = 1;
		}
		
		System.out.println(P);
		System.out.println(sealevel);
		
		
	}

}
