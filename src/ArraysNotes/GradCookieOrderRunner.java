package ArraysNotes;

import java.util.ArrayList;

public class GradCookieOrderRunner {

	public static void main(String[] args) {
		GradCookieOrder chocolateChip = new GradCookieOrder("Chocolate Chip", 15);
		GradCookieOrder oatmeal = new GradCookieOrder("Oatmeal", 10);
		GradCookieOrder sugar = new GradCookieOrder("Sugar", 6);
		GradCookieOrder doubleChocolate = new GradCookieOrder("Double Chocolate", 3);
		GradCookieOrder gingersnap = new GradCookieOrder("Ginger Snap", 21);
		
		ArrayList<GradCookieOrder> cookieList = new ArrayList<GradCookieOrder>();
		
		cookieList.add(chocolateChip);
		cookieList.add(oatmeal);
		cookieList.add(sugar);
		cookieList.add(doubleChocolate);
		cookieList.add(gingersnap);
		
		int largest = -1;
		int index = 0;
		
		for (int i = 0; i < cookieList.size(); i++) {
			if (cookieList.get(i).getOrders() > largest) {
				index = i;
			}
		}
		System.out.println(cookieList.get(index).getCookie());
		
		for (int i = cookieList.size() - 1; i >= 0; i--) {
			if (cookieList.get(i).getOrders() < 15) {
				cookieList.remove(i);
			}
		}
		
		System.out.println(cookieList.size());
		for (int i = 0; i < cookieList.size(); i++) {
			System.out.println(cookieList.get(i).getCookie());
		}
	
		
		
	}

}
