package ArraysNotes;

import java.util.Scanner;

public class Introto2DArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { {1, 2, 3},
				//  ^ row 0
				   {4, 5, 6},
				   {7, 8, 9},
				   {10, 11, 12},
							 };
	//1
	int min = Integer.MAX_VALUE;
	for(int i = 0; i < matrix.length; i++) {
		for(int j = 0; j < matrix[0].length; j++) {
			if(matrix[i][j] < min) {
				min = matrix[i][j];
			}
		} 
	}
	System.out.println(min);	
	
	//2
	if (matrix.length == matrix[0].length) {
		System.out.println("square");
	}
	else System.out.println("rectangle");
	
	//3
	Scanner scan = new Scanner (System.in);
	int num = scan.nextInt();
	int sum = 0;
	
	for (int i = 0; i < matrix.length; i++) {
		sum += matrix[i][num];
	}
	
	System.out.println(sum);
	
	//4
	int sum1 = 0;
	int rowNum = 0;
	int colsum = 0;
	for (int row = 0; row < matrix.length; row++) {
		for (int col = 0; col < matrix[0].length; col++) {
			colsum += matrix[row][col];
		}
		if (colsum > sum1) {
			sum1 = colsum;
			rowNum = row;
		}
		colsum = 0;
	}
	
	System.out.println(rowNum);
	
	//5
	int num1 = scan.nextInt();
	int num2 = scan.nextInt();
	int counter = 0;
	int counter1 = 0;
	
	for (int i = 0; i < matrix.length; i++) {
		for (int j = 0; j < matrix[0].length; j++) {
			if (num1 == matrix[i][j]) counter++;
			if (num2 == matrix[i][j]) counter1++;
		}
	}
	
	if (counter == counter1) {
		System.out.println("they appear the same amount of times");
	}
	else if (counter > counter1) System.out.println(num1 + " appears more times");
	else System.out.println(num2 + " appears more times");
	
	//6
	int num3 = scan.nextInt();
	for (int i = 0; i < matrix.length; i++) {
		for (int j = 0; j < matrix[0].length; j++) {
			if (matrix[i][j] == num3) {
				if (i + 1 > matrix.length) matrix[i][j] = matrix[0][j];
				else matrix[i][j] = matrix[i + 1][j];
				System.out.println(matrix[i][j]);
			}
		}
	}
	
	//7
	boolean inOrder = true;
	for (int i = 0; i < matrix.length; i++) {
		for (int j = 0; j < matrix[0].length - 1; j++) {
			if(matrix[i][j] > matrix[i][j + 1]) {
				inOrder = false;
			}
		}
	}
	
	System.out.println(inOrder);
	
	//8
	int[][] matrix1 = new int[matrix.length][matrix[0].length];
	for (int i = 0; i < matrix.length; i++) {
		for (int j = 0; j < matrix[0].length; j++) {	
			if ((matrix[i][j] % 2 == 0) && (j == matrix[0].length - 1)) {
				matrix1[i][j] = matrix[i][0];
			}
			else if ((matrix[i][j] % 2 == 0)) {
				matrix1[i][j] = matrix[i][j+1];
			}
			else matrix1[i][j] = matrix[i][j];
		}
	}
	for (int row = 0; row < matrix.length; row++) {

		for (int col = 0; col < matrix1[0].length; col++) {
			System.out.print(matrix1[row][col] + " ");
		}
		System.out.println();
	}
	
	//9
	boolean duplicates = false;
	for (int i = 0; i < matrix.length; i++) {
		for (int j = 0; j < matrix[0].length; j++) {
			for (int k = i + 1; k < matrix.length; k++) {
				for (int f = j + 1; f < matrix[0].length; f++) {
					if (matrix[i][j] == matrix[k][f]) System.out.println("(" + i + ", " + j + ") Duplicates");
					duplicates = true;
				}
			}
		}
	}
		if (!duplicates) System.out.println("No duplicates");	
	
	//10
	String[][] wordMatrix = {{"stere", "sejrr", "sd"}, {"ne", "djj", "eirrr"}, {"adl", "ejd", "f"}};
	int counter2 = 0;
	for (int i = 0; i < wordMatrix.length; i++) {
		for (int j = 0; j < wordMatrix[0].length; j++) {
			if (wordMatrix[i][j].length() <= 3) {
				wordMatrix[i][j] = "null";
				counter2++;
			}
		}
	}
	System.out.println(counter2);
	
	//11
		
	String[][] names = {
	{"Leung", "Connor"},
	{"Chen", "Desmond"},
	{"Gao", "Edward"},
	{"Miao", "Emma"},
	{"Ham", "Josh"},
	{"Watson", "Adam"},
	{"George", "Adam"},
	{"She", "Stephanie"},
	{"Wang", "Bill"},
	{"Jia", "Ben"},
	};
	IntroTo2DarraysClass connor = new IntroTo2DarraysClass(names);
	connor.nameList();
	connor.findName("Leung", "Connor");
	connor.findName("Wong", "Kevin");
	}

}
