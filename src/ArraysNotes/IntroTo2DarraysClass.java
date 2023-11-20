package ArraysNotes;

public class IntroTo2DarraysClass {

	public boolean check = false;
	public String[][] listOfnames = new String[10][2];
	public IntroTo2DarraysClass() {
		
	}
	public IntroTo2DarraysClass(String[][]x) {
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[0].length; j++) {
				listOfnames[i][j] = x[i][j];
			}
		}
	}
	public void findName(String lastName, String firstName) {
		for (int i = 0; i < listOfnames.length; i++) {
			if (listOfnames[i][0].equals(lastName) && listOfnames[i][1].equals(firstName)) {
				System.out.println(firstName + " " + lastName);
				check = true;
			}
		}
		if (!check) {
			System.out.println("not found");
		}
		check = false;
	}
	
	public String[][] nameList() {
		return listOfnames;	
	}
}

