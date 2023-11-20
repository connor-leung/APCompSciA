package ArraysNotes;

public class ArraysPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {5, 6, 9, 10, 4, 30, 6, 15, 18, 20, 22, 6, 1, 1, 2, 5};
		int pairSum = 0;
		int testSum = 0;
		for (int i = 0; i < arr.length; i+=2) {
			testSum = arr[i] + arr[i + 1];
			if (pairSum < testSum) {
				pairSum = testSum;
			}
			testSum = 0;
		}
		System.out.println(pairSum);
		
		int sum = 0;
		int[] arr1 = {5, 6, 9, 10, 4, 30, 6, 15, 18, 20, 22, 6, 1, 1, 2, 5, 19};
		for (int i = 0; i < arr1.length; i++) {
			sum += arr1[i];
			if (sum > 50) {
				System.out.println("Element number = " + i + " and the sum is " + sum); 
				break;
			}
		}
		
		int counter = 0;
		for (int i = 1; i < arr.length - 1; i++) {
			if (Math.abs(arr[i] - arr[i - 1]) < 5 && Math.abs(arr[i + 1] - arr[i]) < 5) {
				counter++;
			}
		}
		System.out.println(counter);
		
		int counter1 = 0;
		int testCounter = 1;
		int number = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) testCounter++;
			}
			if (testCounter > counter1) {
				counter1 = testCounter;
				number = arr[i];
			}
			testCounter = 1;
		}
		System.out.println(number + " appears " + counter1 + " times");
		
		
	}

}
