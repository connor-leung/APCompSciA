package ArraysNotes;

public class GradCookieOrder {
	private String type;
	private int orders;
	public GradCookieOrder(String t, int o) {
		type = t; 
		orders = o;
	}
	
	public String getCookie() {
		return type;
	}
	
	public int getOrders() {
		return orders;
	}
}