package ArraysNotes;

import java.util.ArrayList;

public class ArrayLists2 {

	public static void main(String[] args) {
	
		ArrayList<Integer> test = new ArrayList<Integer>();
		test.add(5);
		test.add(21);
		test.add(565);
		test.add(2);
		test.add(0);
		test.add(17);
		
//		int[] test = {1, 3, 4, 100, 42};
		
		
		int counter = 0;
		//cannot modify an array list using a for each loop
		for (int apply: test) {
			if (apply < 10) {
				test.remove(counter);
//				test.set(counter, 0);
				System.out.println(test);
			}
			counter++;
		}
	
	}

}
