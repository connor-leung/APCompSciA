package Lessons;

public class NestedLoopsRandomtesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for (int i=1; i<=5; i++) {
//            for (int j = 1; j <= i;j++) {
//                System.out.print("x");
//            }
//            System.out.println();
//        }
		 for (int i=5; i>=1; i--) {
	            for (int j=1; j < i;j++) {
	            	//prints from the left
	                    System.out.print(" ");
	                }
	            for (int k =0; k < 6-i; k++) {
	            	//reverse of x from top to bottom
	                System.out.print("x");
	            }
	                System.out.println();
	        }
	        //(j = number of space)

	}

}
