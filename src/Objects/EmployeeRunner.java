package Objects;

public class EmployeeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeInfo eden = new EmployeeInfo();
		EmployeeInfo allen = new EmployeeInfo("Allen", 123);
		
		System.out.println(eden + " " + allen);
		
		allen.giveRaise(0.10);
		allen.giveRaise(0.20, 26);

		
	}

}
