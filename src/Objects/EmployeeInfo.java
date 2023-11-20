package Objects;

public class EmployeeInfo {
	
	public String name; 
	public int number;
	public double wageRate = 15.0;
	public double yearsWorking = 0.0; 
	
	public EmployeeInfo() {
		System.out.println("Casual Employee, no name or number needed. ");
	} 
	
	public EmployeeInfo(String initialName, int initialNumber) {
		name = initialName;
		number = initialNumber;
	}
	
	public void setWageRate(double newWageRate) {
		wageRate = newWageRate;
	}
	
	public double getWageRate() {
		return wageRate;
	}
	
	public boolean isSeniorEmployee() {
		if (yearsWorking > 10) return true;
		
		return false;
	}
	
	public double giveRaise (double raise) {
		wageRate += raise;
		return wageRate;
	}
	
	//this is overloading where there is a method with the same name
	public double giveRaise(double raise, double YearsWorking) {
		if (YearsWorking > 25) raise *= 1.5;
		
		wageRate += raise;
		return wageRate;
	}
	
	public String toString() {
		if (name != null) return (name);
		return ("no name");
	}
	//override is an inheritance concept that we will do later
	
}
