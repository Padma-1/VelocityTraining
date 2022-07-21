package oops.polymorphism;

public class Account {
	String name;
	protected double balance;

	public Account(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	// final methods cannot be overriden
	final void deposit(double amt) {
		balance += amt;
		System.out.println("Depositing :" + amt);

	}

	void withdraw(double amt) {
		balance -= amt;
		System.out.println("Withdrawing : " + amt);
	}

}
