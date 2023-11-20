package ArraysNotes;

public class ParameterPassingRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterPassing p = new ParameterPassing();
		int[] arr = {1, 2, 3};
		
		String s = "bbbb";
		
		int b = 2;
//		p.changer(b);
//		System.out.println(b);
		//b is not changed in the Runner but in the class
		
		
		p.changer(b, arr, s);
		System.out.println(b);
		System.out.println(arr[0]);
		System.out.println(s);
	}

}
