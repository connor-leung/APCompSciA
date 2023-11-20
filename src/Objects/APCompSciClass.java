package Objects;

public class APCompSciClass {
	
	public String firstName;
	public boolean playsGamesinClass;
	public double mark = 0.0;
	
	public APCompSciClass() {
		System.out.println("No name entered.");
	}
	public APCompSciClass(String studentName, boolean doTheyPlayGames) {
		playsGamesinClass = doTheyPlayGames;
		firstName = studentName;
	}
	
	//accessors
	public String getName() {
		return firstName;
	}
	
	public boolean getDoesPlayGames() {
		return playsGamesinClass;
	}
	
	public double getMark() {
		return mark;
	}
	
	//mutator methods
	public void setName(String studentName) {
		firstName = studentName;
	}
	
	public void setDoesPlayGames(boolean doTheyPlayGames) {
		playsGamesinClass = doTheyPlayGames;
	}
	
	public void setMark(double currentMark) {
		mark = currentMark;
	}
	
	//void method
	public void badStudent() {
		if(playsGamesinClass) System.out.println("This is a bad student");
		else System.out.println("This is a student");
	}
	
	//method
	public boolean forgiveStudent() {
		if(mark >= 99 && playsGamesinClass == true) {
			System.out.println("Let student play.");
			return true;
		}
		else {
			System.out.println("Yell at student.");
			return false;
		}
	}
	
	public String randomFail(int studentNumber) {
		if (studentNumber % 2 > 0) {
			return "Fail";
		}
		else return "No fail";
	}
	
	//void method
	public void passStudent() {
		if (mark < 50) {
			setMark(50);
		}
	}
	
	//toString
	public String toString() {
		return "Welcome " + firstName; 
	}
}
