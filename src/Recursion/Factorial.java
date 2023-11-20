package Recursion;

public class Factorial {
	
	public int fact(int n) {
		if (n == 1) {
			return 1;	
		}
		else {
			return n* fact(n-1);
		}
	}
	
	public int fib (int n) {
		if (n == 1 || n == 2) {
			return 1;
		}
		else {
			return fib(n-1) + fib(n-2);
		}
	}
	
	
	
}
