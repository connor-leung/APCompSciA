package ArraysNotes;

import java.util.Scanner;

public class IntroArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] arr = {2, 6, 7, 3, 16, 10, 34, 1, 17, 9, 6, 22, 5, 12, 4, 8, 23, 21, 19, 14};
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
	//1	
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
		
		
	//2
		sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println((double)sum/arr.length);
		
	//3	
		int[] res = new int[20];
		for (int i = arr.length; i > 0; i--) {
			res[20 - i] = arr[i - 1];
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(res[i] + " ");
		}		
	//4	
		int temp1 = arr[0];
		int temp2 = arr[arr.length-1];
		arr[0] = temp2;
		arr[19] = temp1;
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	//5
		int min = Integer.MAX_VALUE;
		int minIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
				minIndex = arr[i];
			}
		}
		System.out.println("\n" + minIndex);
		
	//6
		for (int i = 0; i < arr.length; i++) {
			if ((i + 1) % 2 == 0) {
				arr[i] = arr[i] * -1;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("Sum = " + sum);
		
	//7
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				counter++;
			}
		}
		System.out.println("Odd numbers appear " + counter);
		
	//8
		int[] ar = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		sum = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < 10) {
				sum += ar[i] * 2;
			}
			else {
				sum += ar[i];
			}
		}
		System.out.println(sum);
		
	//9
		int num = 0;
		counter = 0;
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter an integer");
		num = scan.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				counter++;
			}
		}
		if (counter == 0) {
			System.out.println("Number is not in array");
		}
		else System.out.println("The number shows up " + counter + " times");
		
	//10
		int num1 = 0;
		int num2 = 0;
		for (int i = 0; i < ar.length/2; i++) {
			num1 += ar[i];
			num2 += ar[(arr.length/2) + i];
		}
		System.out.println(num1 + " " + num2);
		if (num1 > num2) {
			System.out.println("First 10 sum is larger"); 
		} 
		else {
			System.out.println("Last 10 sum is larger"); 
		}
		
	//11
		System.out.println("Enter an integer");
		num = scan.nextInt();
		int counter1 = 0;
		int counter2 = 0;
		for (int i = 0; i < arr.length/2; i++) {
			if (num >= arr[i]) {
				counter1++;
			}
			if (num >= arr[(arr.length/2) + i]) {
				counter2++;
			}
		}
		System.out.println("The first 10 numbers are less than " + num + ", " + counter1 + " times.");
		System.out.println("The last 10 numbers are less than " + num + ", " + counter2 + " times.");

	//12
		for (int i = 1; i < arr.length; i++) {
			if (i > i-1) {
				System.out.println("Number " + i + " Index Slot:" + arr[i]);
			}
		}
	
	//13
		int check1 = 0;
		int check2 = 0;
		System.out.println("Enter an integer");
		num = scan.nextInt();
		for (int i = 0; i < arr.length; i++) {
			check1 = arr[i];
			for (int j = 1; j < arr.length; j++) {
				check2 = arr[j];
				if (check1 == check2);
				else if ((check1 + check2) == num) System.out.println("Index number " + i + " Value: " + arr[i] + " Index number" + j + " Value: " + arr[j]);
				else;
			}
		}
		
	//14 
		//removed 13
		int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20};
		
		for(int i = 1; i < arr1.length; i++) {
			if ((arr1[i] - arr1[i - 1]) > 1) System.out.println("Missing number is " + (i + 1));
		}
		
		
	//15
		int[] arr2 = {-1, 2, 3, -4, -5, 6, -7, -8, -9, -10, 11, 12, 13, -14, 15, 16, 17, -18, -19, 20};
		int[] res1 = new int[arr2.length];
		for (int i = 0; i < arr2.length - 1; i+=2) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr2[j] > 0 && res1[i] == 0) {
					res1[i] = arr2[j];
					arr2[j] = 0;
					break;
				}
			}
			for (int j = 0; j < arr2.length; j++) {
				if (arr2[j] < 0 && res1[i+1] == 0) {
					res1[i+1] = arr2[j];
					arr2[j] = 0;
					break;
				}
			}	
		}
		System.out.println();
		for (int i = 0; i < res1.length; i++) {
			System.out.print(res1[i] + " ");
		}
		
		//easier way to solve
		
		int counter3 = 0;
		int[] res2 = new int[arr2.length];
		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] > 0) res2[counter3] = arr2[i];
			
			counter3 += 2;
		}
		counter3 = 1;
		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] < 0) res2[counter3] = arr2[i];
			counter3 += 2;
		}
		System.out.println();
		for (int i = 0; i < res2.length; i++) {
			System.out.print(res2[i] + " ");
		}
		
	//16
		System.out.println();
		int[] arr3 = new int[20];
		arr3[0] = 1;
		arr3[1] = 1;
		int check3 = 0;
		int check4 = 0;
		for (int i = 2; i < arr.length; i++) {
			arr3[i] = (int)(Math.random()*50);
		}
		for (int i = 0; i < arr3.length; i++) {
			check3 = arr3[i];
			for (int j = 0; i < arr3.length; i++) {
				check4 = arr3[j];
				if (i == j && check3 == check4);
				else if (check3 == check4) {
					System.out.println("Duplicates are in index " + i + ", " + j + " and the values are " + check3);
					break;
				}
			}
			
		}
		
	//17 not done yet
//		int[] arr4 = new int[20];
//		arr4[0] = 1;
//		arr4[1] = 1;
//		arr4[2] = 1;
//		arr4[3] = 1;
//		int check5 = 0;
//		int check6 = 0;
//		for (int i = 2; i < arr.length; i++) {
//			arr4[i] = (int)(Math.random()*50);
//		}
//		for (int i = 0; i < arr4.length; i++) {
//			check5 = arr4[i];
//			for (int j = i + 1; j < arr4.length; j++) {
//				check6 = arr4[j];
//				if (check5 == check6) {
//					
//				}
//			}
//		}
		
		
	//18
		//assuming the non-duplicate is not at the front
		int[] arr5 = {1, 1, 9, 1};
		int check7 = 0;
		int check8 = 0;
		for (int i = 0; i < arr5.length; i++) {
			check7 = arr5[i];
			for (int j = 0; j < arr5.length; j++) {
				check8 = arr5[j];
				if (check7 != check8 && i != j) System.out.println("Not duplicate is " + check8);
			}
			break;
		}
		
	}
	
}
