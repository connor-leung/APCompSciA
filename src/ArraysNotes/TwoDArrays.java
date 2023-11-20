package ArraysNotes;

public class TwoDArrays {

	public static void main(String[] args) {
		//jagged arrays are not on the ap
		
		//to declare
		int[][] mat = new int [5][5];
		
		//below is a 3 by 4 matrix
		//rows and column starts at 0
						//  0  1  2
		int[][] matrix = { {1, 2, 3},
						//  ^ row 0
						   {4, 5, 6},
						   {7, 8, 9},
						   {10, 11, 12},
									 };
		
		//to traverse a 2D array
		//use a nested for loop
		
		//the outside loop is for rows
		//the inside loop is for columns
		
		for (int row = 0; row < matrix.length; row++) {
			//outside for loop is row
			for (int col = 0; col < matrix[0].length; col++) {
				//inside for loop is column
				//matrix[0] traverses the row
				//to print jagged arrays replace maxtrix[row]
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}
		
		//Vocab:
		//When traversing a 2D array, and going row by row,
		//this is called row major order
		//the opposite is called column major order
		//dont need to define on the question
		
		//Exercise:
		//Determine whether a 2D array is ordered from 
		//smallest to biggest using row major order
		
		boolean inOrder = true;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length - 1; j++) {
				if(matrix[i][j] > matrix[i][j + 1]) {
					inOrder = false;
				} //if
			}//inside for
		}//outside for
		
		System.out.println(inOrder);
		
		
		//Exercise:
		//Print the sum of every column 
		int colsum = 0;
		for (int col = 0; col < matrix[0].length; col++) {
			//has to make matrix[0] in col loop not matrix[col] in row for loop
			//or else it tries to grab from an imaginary column
			for (int row = 0; row < matrix.length; row++) {
				colsum += matrix[row][col];
			}
			System.out.println(colsum);
			colsum = 0;
		}
		
		//Exercise:
		//Print out the row with the largest sum
		
		
		
	}

}
