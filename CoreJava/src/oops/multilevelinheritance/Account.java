package oops.multilevelinheritance;

//multilevel Inheritance
public class Account { // base class for Savings Account
	int accNo;
	String name;

	public Account(int accNo, String name) {
		this.accNo = accNo;
		this.name = name;
	}

	void display() {
		System.out.println("***********Account Details***********");
		System.out.println("Account Number :"+accNo);
		System.out.println("Account Name :"+name);
	}

}
