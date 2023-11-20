package ArraysNotes;

import java.util.Arrays;
//type this to import powerful tools

public class ArrayUtillity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Not required
		
		int[] arr1 = {1, 2, 3};
		int[] arr2 = {6, 4, 5, 2};
		
		System.out.println(Arrays.equals(arr1, arr2));
		Arrays.sort(arr2);
		
		Arrays.fill(arr2, -2);
		
		
		
	}

}
