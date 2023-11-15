
public class NestedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0; i<5; i++) {
            for (int j = 0; j<3; j++) {
                System.out.println("outer:" + i + "inner" + j);
                //runs inner for loop 3 times 
                //runs outer for loop 5 times
            }
        }

        //tens times tables
        for (int i=1; i<=10; i++) {
            for (int j=1; j<=10; j++) {
                System.out.println(i + "x" + j + " = " + (i*j));
            }
        }
        
        //prints x's depending on the first loop 
        for (int i=5; i>=1; i--) {
            for (int j =i; j>=1;j--) {
                System.out.print("x");
            }
            System.out.println();
        }
        

        //does the same as the earlier code but with spaces in from 
        for (int i=5; i>=1; i--) {
            for (int j=1; j< i;j++) {
            	//prints from the left
                    System.out.print(" ");
            }
            for (int k =0; k<6-i; k++) {
            	//reverse of x from top to bottom
                System.out.print("x");
            }
                System.out.println();
        }
        //(j = number of space)

        }

	}
