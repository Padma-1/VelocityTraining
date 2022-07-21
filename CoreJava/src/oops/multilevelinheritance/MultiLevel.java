package oops.multilevelinheritance;

/*
 * Multilevel inheritance
 * Account ->Savings Bank -> Account details
 */
public class MultiLevel {
	public static void main(String[] args) {
		AccountDetails ac1 = new AccountDetails(9999, "Ramesh", 1000, 5000, 2000, 1000);
		ac1.display();// invoke display() method of account details
	}

}
