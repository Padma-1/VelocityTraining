package oops.polymorphism;

//Java program to implement method overloading - static polymorphism
public class Addition {

	//add() method is overloaded
	void add() {
		System.out.println("Method overloading Demo");
	}
	
	void add(int a, int b) {
		System.out.println("The addition of two numbers is: "+(a+b));
	}
	
	void add(double a, double b) {
		System.out.println("The addition of two float  numbers is: "+(a+b));
	}
	
	void add (int a, int b, int c) {
		System.out.println("The addition of three numbers is: "+(a+b+c));
	}
	
	void add(String s1, String s2 ) {
		System.out.println("The additon of two strings : "+(s1+s2));
	}
	void add(int a, double b) {
		System.out.println("The addition of two numbers is: "+(a+b));
	}
	void add(double a, int b) {
		System.out.println("The addition of two numbers is: "+(a+b));
	}
}
