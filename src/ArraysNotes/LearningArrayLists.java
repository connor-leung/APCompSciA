package ArraysNotes;

import java.util.ArrayList;
//have to import

public class LearningArrayLists {

	public static void main(String[] args) {
		//ArrayLists are linked lists
		//The are like an array, but have more flexibility
		//ArrayLists can only contain objects
		
		//To declare an ArrayList of Strings
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Eden");
		list.add("Allen");
		list.add("Michael Uniform Chen");
		
		//to traverse the list
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//to remove an item, use remove
		//all items after, are moved down
		
		list.remove(1);
		
		//set allows you to replace an item
		//it returns the item you removed
		
		System.out.println("Set returns " + list.set(1, "Adam"));
		
		//primitive data, like int, can be used in a Arraylist
		//due to autoboxing --> immediately input primative data
		
		//There is an integer class
		
		Integer i1 = new Integer (1);
		Integer i2 = new Integer (5);
		
		//cross mean deficated which means autoboxing already worked
		
		ArrayList<Integer> ilist = new ArrayList<Integer>();
		ilist.add(i1);
		ilist.add(i2);
		ilist.add(new Integer (3));
		ilist.add(7);
		
		//--------------------------------------------------------------
		//The most common ArrayList error
		System.out.println();
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//Remove all instances of Adam from the list
		//Wrong algorithm because when list.remove removes 
		//it skips some slots: 
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals("Adam")) {
				list.remove(i);
			} 
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//To fix this problem:
		//Method 1:
		//Go backwords
		for (int i = list.size() - 1; i >= 0; i--) {
			if (list.get(i).equals("Adam")) list.remove(i);
		}
		
		//Method 2:
		//Use a while loop
		
		int i = 0;
		while (i < list.size()-1) {
			if (list.get(i).equals("Adam")) list.remove(i);
			else i++;
		}
		
		
	}

}