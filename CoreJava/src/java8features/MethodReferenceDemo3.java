package java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Order {

	public enum Side {
		BUY, SELL
	}; // constant array

	private int quantity;
	private String symbol;
	private double price;
	private Side side;

	public Order(int quantity, String symbol, double price, Side side) {
		this.quantity = quantity;
		this.symbol = symbol;
		this.price = price;
		this.side = side;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Side getSide() {
		return side;
	}

	public void setSide(Side side) {
		this.side = side;
	}

	@Override
	public String toString() {
		return "Order [quantity=" + quantity + ", symbol=" + symbol + ", price=" + price + ", side=" + side + "]";
	}
	// sorting algorithm a > b -> returns positive value

	// if a>b == >0 , if a<b == <0 , if a==b -->0
	public static int compareByQuantity(Order a, Order b) {
		return a.quantity - b.quantity;
	} // 1000 - 500 = 500 / 500 -1000 = -500

	public int compareByPrice(Order a, Order b) {
		return Double.valueOf(a.getPrice()).compareTo(Double.valueOf(b.getPrice()));
	}

}

public class MethodReferenceDemo3 {
	
	public static void main(String[] args) {
	Order ord1 = new Order(1000, "GOOG.NS", 12000.10, Order.Side.BUY);
	Order ord2 = new Order(500, "MS.TS", 5000.50, Order.Side.SELL);
	Order ord3 = new Order(750, "MS.TS", 2000.50, Order.Side.BUY);

	List<Order> orderBook = new ArrayList<Order>();

	orderBook.add(ord1);
	orderBook.add(ord2);
	orderBook.add(ord3);

	// Sort all orders based on quantity using Lambda
	System.out.println("Before Sorting : "+orderBook);// invokes toString() method
	
	Collections.sort(orderBook,(a,b)->Order.compareByQuantity(a,b));
	System.out.println("After sorting : "+orderBook);
	
	// Sort all orders based on quantity using Method Reference BY calling static Method
	Collections.sort(orderBook,Order::compareByQuantity);
	System.out.println("After Sorting : "+orderBook);

	// Sort all orders based on price using Method Reference BY calling instance Method
	Order order = orderBook.get(0);// we require reference of Object
	Collections.sort(orderBook,order::compareByPrice);
	System.out.println("Order Book after Sorting by Price: "+orderBook);

	// method Reference example for Arbitrary Object of a particular type
	String[] symbols = { "GOOGLE", "amazon", "microsoft", "APPLE" };
	Arrays.sort(symbols,String::compareToIgnoreCase); // String.compareToIgnoreCase()

	for(String i:symbols)
		System.out.println(i);
}

}
