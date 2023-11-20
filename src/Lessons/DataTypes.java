package Lessons;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Objects and primitive data
		
		//Objects have multiple pieces of information (not being tested right now)
		//primitive data has one piece of information (one memory space) 
		
		//Objects are capitalized 
		//primitive data is never capitalized 
		//int (primitive data), double(primitive data), String (Object)
		
		//to declare a variable, declare the type first
		//a variable name has no spaces, no symbols, and cannot start with a number
		
		int connor = 1; 
		connor = 2;
		// "=" is an assignment
		System.out.println(connor);	
		
		int desmond = 3;
		
		connor = connor + desmond;
		connor = connor + 1;
		System.out.println(connor);
		
		/* useful operators
		 * ++ adds 1
		 * += adds 10
		 * --subtracts 1
		 */
	
		connor = 1;
		connor++;
		connor += 5;
		// adding an integer after causes the += to function as an + sign
		connor--;
		
		System.out.println(connor);
		
		//an int has a maximum value
		//Rather than memorizing the specific value, 
		//Java provides the following constants
		/* Integer.MAX_VALUE;
		 * Integer.MIN_VALUE;
		 * 
		 */
		
		System.out.println(Integer.MAX_VALUE);
		
		//double are real numbers
		//integers can be store in doubles, but not vice versa
		
		double x = 1.2345;
		System.out.println(x);
		x = 5;
		System.out.println(x);
		x = Math.PI;
		
		System.out.println(x);
		
		int i = 1;
		double d = 1.5;
		
		//error 
		//i = d;
		
		//casting
		//allows doubles to be converted into integers
		//allows doubles to be truncated (means to cut off a number)
		//1.99 truncated becomes 1
		//use Math.round() to round numbers
		
		double josh = 5.9;
		System.out.println(Math.round(josh));
		int allen;
		
		allen = (int)josh;
		System.out.println(allen);
		
		/*random number between 10 and 30 
		 * note: you must cast the multiplication
		 * not just Math.random()
		 * 
		 */
		
		int rand = (int)(Math.random()*(21)) + 10;
		System.out.println(rand);
		
		System.out.println((int) (Math.random()*((30-10)+1) + 10));
		
		double eden; 
		eden = (double) 22/7;
		//both the declariation and the assignment have to be the same
		//both have to be double or int 
		System.out.println(eden);
		
		double max;
		max = (double)(4.0/3); 
		//did integer division with the "/" then did double makes it an int
		//adding a .0 makes it into a double
		
		System.out.println(max);
		
		//creating constants
		//Sometimes, you want to create a variable
		//that cannot be changed
		
		//use the keyword final to make a variable a constant
		//constants are usually all caps 
		
		final double GRAVITY = 9.8;
//		GRAVITY = 10.2;
		
//		int a = 10; 
//		int b = 5;
//				
//		System.out.println(a += b);
//		int a = 10;
//		int b = 5;
//		
//		if (a < 0) {
//			b = -b;
//			a = -a;
//		}
//		c = 0;
//		while (a > 0) {
//			c += b;
//			a--;
//		}
		
	}

}
