package ArraysNotes;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to declare an array
		int[] arr2 = new int[10];
		
		//inserts 5 into box 0
		arr2[0] = 5;
		
		//prefull array
		int[] arr = {5, 1, 3, 4, 20, -2, 7, 8, -4, 10};
		
		//Exercise
		//Switch the first and the last elements in an array
		//Note: arr.length is the length of the array
		
		//Wrong way 
//		arr[0] = arr[arr.length-1];
//		arr[arr.length-1] = arr[0];
		
		//Right way
		int temp = arr[0];
		arr[0] = arr[arr.length-1];
		arr[arr.length-1] = temp;
		
		//You can use a for loop to go through an array
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		//if i exceeds the array length
		//it would be called an index out of bounds error 
		
		//Exercise
		//Print out the average of the array of numbers
		
		int sum = 0;
		for (int j = 0; j < arr.length; j++) {
			sum += arr[j];
		}
		System.out.println((double)sum/arr.length);
	
		//Exercise
		//find the smallest or largest value in an array
		
		int max = Integer.MIN_VALUE;
		//or max = arr[0];
		int maxIndex = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				maxIndex = i;
			}
		}
		System.out.println("Max value is " + max + " and the index number is " + maxIndex);
		System.out.println();
		
	}

}
