package Lessons;

public class String2Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Q1 
		String str = "edcbaedcba";
		for (int i = str.length()-1; i >= 0; i--) {
			System.out.print(str.substring(i, i + 1));
		}
		
		String str2 = "aaacomputeraaaaa";
		int num = str2.indexOf("computer");
		System.out.println("before : " + num);
		System.out.println(str2.length() - num + 8); //8 can be a varaible ex: word = "computer" and word.length()
		//8 represents how many letters in computer
		
		String word1 = "computer";
		String word2 = "sciences";
		
		//assume word1 is longer than word2 
		//assume even letters
		
		String res = "";
		for (int i = 0; i < word2.length(); i += 2) {
			res += word1.substring(i, i + 2) + word2.substring(i, i + 2);
		}
		System.out.println(res);
		
	}

}
