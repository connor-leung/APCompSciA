package Lessons;

public class BOOLEAN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Boolean is either true or false
		
		//Boolean operators
		
		//&& and (both have to be true) 
		//|| and | is or  (one has to be true)                       
		
		//Example 1
		System.out.println(true && false);
		
		int age = 15;
		int grade = 10;
		
		//Is a student 15 years old and in grade 10?
		System.out.println(age==15 && grade==10);
		//would print false if age==14
		
		grade = 9;
		//Is a student 15 years old or in grade 10?
		System.out.println(age==15||grade==10);
		
		//Is a student between 14 and 17 years old (inclusive)
		System.out.println(age<=14||age>=18);
		
		/*A student is on the special senior honour roll if the student
		 * has an 86% average and higher is in grade 11 or 12, 
		 * and is between 16 and 18
		 */
		double gpa = 89.5;
		grade = 11;
		age = 16;
		
		System.out.println((gpa >= 86.0) && (grade==11||grade==12) && (age >=16 && age <=18));
		
		//A student is in grade 8 to 11
		System.out.println(!(grade==12));
		
//		De Morgan's Laws
//		!(a && b) is equivalent to !a || !b
//		!(a||b) is equivalent to a! && !b
//		! makes any result opposite 
		
		
		//short circuit
		//if the first part of an expression decides the entire expression, 
		//the rest of the expression is not evaluated  
		
		grade = 8;
		gpa = 77.5;
		System.out.println(grade==7 && gpa<67.0);
		
		//Since grade 7 is false, the rest of the expression is not evaluated 
		
		System.out.println(grade==8||gpa<67.0);
		//Since grade 7 is true, the entire expression is true, so the rest of the expression is not evaluated
		
		// != means not equal
		
		System.out.println(false==false || !true && false);
		
		
		
	}

}
