
public class IfStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//A one line if statement requires no braces
		
		int a = 1;
		
		if (a==1) System.out.println("one line if");
		
		//Use braces for multiple statements
		
		if (a==1) {
			System.out.println("two line");
			System.out.println("if statement");
		}
		
		//An else statement runs if the if statement is false
		
		if (a==2) {
			System.out.println("This won't run. ");
		} else {
			System.out.println("The else runs");
		}
		
		//Exercise
		//A for 86 to 100
		//B for 73 to 85
		//F for any mark below 72
		//Error for marks less than zero and greater than 100
		
//		double grade = 75;
//		
//		if (grade <= 72 && grade >= 0) {
//			System.out.println("F");
//		} else {
//			if(grade >= 86 && grade <= 100) {
//				System.out.println("A");
//				
//			}
//			if(grade <= 85 && grade >= 73) {
//				System.out.println("B");
//			} 
//			
//		}
		
		double grade = 75;
		
		if(grade >= 86 && grade <= 100) System.out.println("A Grade");
		if(grade >= 73 && grade <= 86) System.out.println("B Grade");
		if(grade >= 0 && grade <= 73) System.out.println("Fail");
		if(grade < 0 || grade > 100) System.out.println("Error");
		
		if(grade >= 86 && grade <= 100) System.out.println("A Grade");
		else if(grade >= 73 && grade <= 86) System.out.println("B Grade");
		else if(grade >= 0 && grade <= 73) System.out.println("A Grade");
		else System.out.println("Error");
	}

		
}
