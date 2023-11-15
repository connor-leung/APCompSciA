
public class Operations {

	public static void main(String[] args) {
		
		//Math Operations
		//Square root is defined as sqrt
		System.out.println(Math.sqrt(81));
		
		//power is defined as pow
		System.out.println(Math.pow(2,5));

		//abosulte value is abs
		System.out.println(Math.abs(-100));
		
		//random number
		//will give you a number between 0 and 1(non-ic)
		//function is random
		System.out.println(Math.random());
		
		//this takes numbers from 0-9 because 0 is 1
		System.out.println(Math.random()*10);
		
		//will give you a number between 0-10
		System.out.println(Math.random()*(10) + 1);
		
		/* how to get a range of two numbers
		 * System.out.println(Math.random()*(high-low)+1)+low
		 * you need the plus one b/c you need to count the starting
		 */
		
		// next math mod (or modulus)
		//remainders
		//mod operator is %
		
		System.out.println("24 mod 7 is " + 24 % 7);
		
		//mod is only useful for integers
		//however, it can be used for real numbers
		
		//when is mod useful?
		//example - to determine if an integrer is odd or even
		
		// one = is an assignment
		// two == is a test of equality
		
		int x = 14;
		
		if (x % 2 == 0) {
			System.out.println("x is even.");
		} else {
			System.out.println("x is odd.");
		}  
		
		/*Exercise:
		 * int num = 123
		 * prints 1, 2, 3
		 */
		
		int num = 123;
		
		System.out.println("The first digit is " + num %100 %10);
		// it takes 23, then 3 which it prints
		System.out.println("The second digit is " + num %100/10);
		// it takes 23 then divides it by 10 which gets 2.3 which is removed
		System.out.println("The third digit is " + num /100);
		// it shifts over the decimal and gives 1.23 which the decimals get whited out
		
		//Exercise 2
		//Given a number of hours
		//print out years, days, hours
		//Example:
		//int hours = 1000
		int hours = 1000+8760;
		int years = hours/24/365;
		System.out.println("Years " + hours / 24 / 365);
		System.out.println("days " + (hours / 24 - (365*years)) );
		System.out.println("hours " + hours % 24);
				
		System.out.println(Math.sqrt(127) % 5);		
		
		System.out.print("hello" + "\n what");
		System.out.println(10.0/4);
		
		
		
		
		
	}

}
