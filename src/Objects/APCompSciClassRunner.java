package Objects;

public class APCompSciClassRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		APCompSciClass connor = new APCompSciClass();
		APCompSciClass kevin = new APCompSciClass("Kevin", false);
		APCompSciClass adam = new APCompSciClass("Adam", true);
		APCompSciClass desmond = new APCompSciClass("Desmond", true);
		
		connor.setName("Connor");
		connor.setMark(49.0);
		kevin.setMark(99);
		desmond.setMark(98.0);
		adam.setMark(100.0);
		connor.setDoesPlayGames(true);
		
		connor.badStudent();
		kevin.badStudent();
		
		connor.forgiveStudent();
		adam.forgiveStudent();
		desmond.forgiveStudent();
		
		adam.randomFail(1);
		desmond.randomFail(2);
		
		connor.passStudent();
		System.out.println(connor.getMark());
		kevin.passStudent();
		System.out.println(kevin.getMark());
		
		System.out.println(connor);

		
	}

}
