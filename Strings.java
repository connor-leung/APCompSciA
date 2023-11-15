 
public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Strings are objects
		//They have helpful methods
		
		//To declare a String (two different ways of declaring a String)
		String str1 = new String ("Adam");
		//str1 is a variable
		String str2 = "Jack"; 
		
		//To compare Strings
		//we must use .equals
		//do NOT use == 
		
		if (str1.equals(str2)) {
			System.out.println("same word");
		}
		
		
		//To get a string length
		//.length()
		
		System.out.println(str1.length());
		
		//toUpperCase() and toLowerCase()
		System.out.println(str1.toUpperCase());
		
		//To join Strings together, concatenate
		//use .concat
		
		System.out.println(str1.concat(str2));
		
		//To test if a character or String is within
		//a String 
		//use indexOf
		//Note: Strings begin with 0
		
		System.out.println(str2.indexOf("c"));
		//first character starts at 0
		//J = 0, A = 1, C = 2, K = 3
		
		String str3 = "AllenHuHu"; 
		System.out.println(str3.indexOf("H"));
		//only print first occurrence  
		System.out.println(str3.indexOf("Hu"));
		//first occurrence of Hu is at 5 because the H starts at 5
		System.out.println(str3.indexOf("Michael"));
		//negative 1 because there isnt M or Michael
		
		//substring
		//returns the string from (a, b)
		//a is inclusive, b is not
		
		String str4 = "Desmond";
		System.out.println(str4.substring(3, 6));
		//the range 3-6 captures the mon in desmond
		//the 6 is not inclusive
		
		//str4.substring (3, 7) works because 7 is not inclusive 
		//str4.substring (3, 8) is an error 
		
		//substring also takes 1 parameter
		//substring (a) returns 
		//from that index onward
		
		System.out.println(str4.substring(3));
		//captures everything including and after 3
		
		//To compare Strings, use compareTo
		String str5 = "emma";
		String str6 = "aamir";
		
		System.out.println(str6.compareTo(str5));
		//A negative number means str6 is alphabetically
		//ahead of str5
		//Note:captial letters come before lower case letters
		//Each letter is associate d with a number
		//a = 1, b = 2, c = 3, etc. 
		//compareTo means object1 - object2
		//"a" - "e" = -4
		
		//-------------------------------------------------
		
		//Exercise 1
		//Print every letters in a word, letter by letter
		
		for (int i = 0; i < str4.length(); i++) {
			System.out.println(str4.substring(i, i + 1));
		}
		
		//Exercise 2
		//Count how many times "m" appears in Emma's name (str5)
		
		int counter = 0;
		
		for (int j = 0; j < str5.length(); j++) {
			if (str5.substring(j, j + 1).equals("m")) {
				//substring finds out what the next letter is 
				//equals checks if that next letter is m
				counter++;
			}
		}
		
		System.out.println(counter);
		
		//--------------------------------------------------
		
		//Exercise 3
		//Take Allen's name and replace the "l" with "x"
		//without using replace
		
		str3 = str3.replace("l", "x");
		System.out.println(str3);
		
		//Exercise 4
		//replacing a specific letter
		int num;
		String str7 = "BallenHu";
		
//		while (str7.indexOf("l") != -1) {
			num = str7.indexOf("l"); //num is 2
			System.out.println(str7.substring(0, num) + "x" + str7.substring(num+1));
//		}
		
		
		
	}

}
