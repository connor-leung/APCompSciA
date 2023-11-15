
public class Notes {

	public static void main(String[] args) {
		//This is a comment
		/*this is a longer comment
		 * it allows you to press enter and not 
		 * create issues in code 
		 * the slashes are kinda like brakcets 
		 * for your comments
		 */
		System.out.println("hello world");
		
		System.out.print("Connor");
		System.out.print("Desmond");
		//without ln, the code combindes the two strings
		
		System.out.println();
		/*nothing gets printed since there are no strings 
		 * in the brackets
		 */
		System.out.println("hello");
		/*escape characters
		 * allows us to print  special characters
		 *   \" = quotations
		 *   \\ (puts a slash)
		 *   \n (new line)
		 *   \' (adds ')
		 *   \t (tab)
		 */
		System.out.println("Aamiya said, \"I love food.\"");
		System.out.println("Aamiya said, \\I love food.\\");
		System.out.println("Aamiya said, \'I love food.\'");

		System.out.println(5*5);
		System.out.println(1/2);
		// this function above doesn't display a decimal
		//b/c java only displays integers when given integers
		System.out.println(1.0/2.0);
		System.out.println("What is " + 1 + 1);
		/* the "+" is adding the two numbers as strings
		 * ie putting the two 1s togther to get 11
		 */
		
		System.out.println("7 x 8 = " + 7 * 8);
		System.out.println(1 + 1 + " is two");
		//this shows how java adds using the function before it
		//ie the 1+1=2 + is two
		
		
		System.out.println(1 + 1 + " is two, which is also" + 1 + 1);
		/* java only takes the operation of the first one
		 * therefore it causes the 1s to be combined as strings
		 */
		System.out.println(1 + 1 + " is two, which is also " + (1 + 1));

		System.out.println("Number " + 1 + 2 + 3);
		System.out.println(1 + 2 + 3 + "Number");
		System.out.println("ABC" + 1 + 2 + 3 + "ABC");
		System.out.println("\"50 plus 25 is \"" + (50 +25));
		System.out.println("Number " + 2 *  3 + 2);
		
		
		System.out.println("\\\\hello " + "\nworld");
		
		
		
	}

}