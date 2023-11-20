package Lessons;
import java.util.Scanner;

public class StringsAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
//		//1)
//		String str1 = "Computer";
//		System.out.println(str1.length());
//		
//		//2)
//		String str2 = "hello";
//		String str3 = "world";
//		System.out.println(str2.concat(str3));
//		
//		//3)
//		String str4 = "hello";
//		System.out.println(str4.toUpperCase());
//		
//		//4)
//		if (str1.compareTo(str2) == 0) {
//			System.out.println(str1 +" is the same word as " + str2);
//		}
//		else if (str1.compareTo(str2) < 0) {
//			System.out.println(str2 + " is before " + str1);
//		}
//		else {
//			System.out.println(str2 + " is before " + str1);
//		}
//
//		//5)
//		String str5 = "HelloWorld";
//		System.out.println(str5.substring(0, 5));
//		
//		//6)
//		System.out.println(str5.substring(3, 7));
//		
//		//7)
//		System.out.println(str5.substring(5, 10));
//		
//		//8)
//		//idk if you want me to do a test to see if it is in the word
//		//or if you wanted the number value of cde in abcdefgh
//		String str6 = "abcdefgh";
//		if (str6.indexOf("cde") > 0 ) {
//			System.out.println("cde is inside abcdefgh");
//		}
//		
//		//9)
//		int counter = 0;
//		String res = "";
//		
//		String word = "aaabbbaaacccaaa";
//		for (int i = 0; i < word.length() - 2; i++) {
//			res = word.substring(i, i + 3);
//			if (res.indexOf("aaa") >= 0) {
//				counter++;
//			}
//		}
//		System.out.println("aaa comes up " + counter + " times");
//		
//		//10)
//		String word1 = "computer";
//		String word2 = "science";
//		System.out.println("Type an integer where you want to replace science in");
//		int num = scan.nextInt();	
//		String res1 = "";
//		for (int i = 0; i <= num; i += 2) {
//			res1 = word1.substring(0, num + 1) + word2 + word1.substring(num + 1, 8);
//		}
//		System.out.println(res1);
//		
//		//11)
//		int counter1 = 0;
//		System.out.println("Pick a random letter");
//		String letter = scan.nextLine();
//		System.out.println("Pick a random word");
//		String word3 = scan.nextLine();
//		for (int i = 0; i < word3.length(); i++) {
//			if (word3.substring(i, i + 1).equals(letter)) {
//				counter1++;
//			}
//		}
//		System.out.println(counter1);
//		
		//12)
		//this code gets letters that are next to each other ex: connor -> coor
		System.out.println("Enter a string");
		String word4 = scan.nextLine();
		System.out.println("Enter a letter");
		String letter1 = scan.nextLine();
		int num1 = word4.indexOf(letter1); 
		if (word4.indexOf(letter1) >= 0) {
			for (int i = 0; i <= word4.length(); i++) {
				if (word4.indexOf(letter1) >= 0) {
					word4 = word4.substring(0, num1) + "" + word4.substring(num1 + 1);
					num1 = word4.indexOf(letter1);
				}
				
			}
			System.out.println(word4);
		}
		else { 
			System.out.println("does not appear in the string");
		}
	}

}
