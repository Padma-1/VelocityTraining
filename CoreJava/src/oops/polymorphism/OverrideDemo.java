package oops.polymorphism;

class Bank { // base class
	int getRateOfInterest() {
		return 0;
	}

	void display() {
		System.out.println("Welcome to bank");
	}
}

class SBI extends Bank {
	int getRateOfInterest() { // overriden method
		return 5;
	}
}

class ICICI extends Bank {
	int getRateOfInterest() { // Method overriden in child class
		return 7;
	}
}

class Axis extends Bank {
	int getRateOfInterest() { // Method overriden in child class
		return 6;
	}
}

public class OverrideDemo {

	public static void main(String[] args) {
		SBI b1 = new SBI();
		ICICI b2 = new ICICI();
		Axis b3 = new Axis();

		b1.display();// base class method

		// invoke overriden method getRateOfInterest() in SBI class
		System.out.println("The interest rate of SBI is :" + b1.getRateOfInterest());

		b2.display(); // base class method
		// invoke overriden method getRateOfInterest() in ICICI class
		System.out.println("The interest rate of ICICI is :" + b2.getRateOfInterest());

		b3.display(); // base class method
		// invoke overriden method getRateOfInterest() in Axix class
		System.out.println("The interest rate of Axis is :" + b3.getRateOfInterest());

	}

}
