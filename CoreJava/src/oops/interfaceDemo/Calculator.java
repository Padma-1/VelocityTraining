package oops.interfaceDemo;

import java.util.Scanner;

//program to understand concept of interface
public class Calculator implements IMath {

	Scanner kb;
	

	@Override
	public void add() {
		kb = new Scanner(System.in);
		System.out.println("Enter 2 integers to perform addition");
		int a = kb.nextInt();
		int b = kb.nextInt();
		int s = a + b;
		System.out.println("Sum of " + a + " and " + b + " is " + s);

	}

	@Override
	public void sub() {
		kb = new Scanner(System.in);
		System.out.println("Enter 2 integers to perform Subtraction");
		int a = kb.nextInt();
		int b = kb.nextInt();
		int s = a - b;
		System.out.println("Subtraction of " + a + " and " + b + " is " + s);

	}

	@Override
	public void mul() {
		kb = new Scanner(System.in);
		System.out.println("Enter 2 integers to perform multiplication");
		int a = kb.nextInt();
		int b = kb.nextInt();
		int s = a * b;
		System.out.println("Multiplication of " + a + " and " + b + " is " + s);

	}

	@Override
	public void div() {
		kb = new Scanner(System.in);
		System.out.println("Enter 2 integers to perform division");
		int a = kb.nextInt();
		int b = kb.nextInt();
		int s = a / b;
		System.out.println("Division of " + a + " and " + b + " is " + s);

	}

	void display() {
		System.out.println("my calculator - Designed by Padma");
	}

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.display();
		c.add();
		c.sub();
		c.mul();
		c.div();
	}

}
