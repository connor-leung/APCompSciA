package Recursion;

public class RecursionPractice {
	
//	public int mystery(int x) {
//		if (x == 0) {
//			return 0;
//		}
//		else {
//			return ((x % 10) + mystery(x / 10));
//		}
//	}
	
//	public int mystery(int x) {
//		if (x == 1) {
//			return 2;
//		}
//		else return 2 * mystery(x -1);
//	}
	
//	public int mystery(int x) {
//		if (x == 0) {
//			return 0;
//		}
//		else {
//			return (x + mystery(x/2) + mystery (x / 4));
//		}
//	}
	
//	public int mystery (int x, int y) {
//		if (x >= 100 || y <= 0) {
//			return 1;
//		}
//		else return mystery(x+10, y -3);
//	}
	
//	public int mystery (int x) {
//		if (x <= 1) {
//			return 1;
//		}
//		else {
//			return 2 * mystery(x -2);
//		}
//	}
	
	public static int mystery(int x) {
		int sum = 0;
		while (x >= 0) {
			sum += x;
			x--;
		}
		return sum;
	}
	
	public static int mystery1(int x) {
		if (x == 0) {
			return 0;
		}
		return (x + mystery1(x - 1)); 
	}
	
	public static int mystery2(int x) {
		if (x == 0) {
			return 0;
		}
		else {
			return mystery2(x - 1);
		}
	}
	
	public static int mystery3(int x) {
		if (x == 1) {
			return 1;
		}
		return (x + mystery3(x - 1));
	}
	
	
	
}
