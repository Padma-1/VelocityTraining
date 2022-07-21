package oops.multilevelinheritance;

public class AccountDetails extends SavingsBank {

	int withdrawl, deposit, finalbalance;

	public AccountDetails(int accNo, String name, int mb, int b, int w, int d) {
		super(accNo, name, mb, b);
		this.withdrawl = w;
		this.deposit = d;
	}

	void display() {
		super.display();// invokes savings bank display() method
		System.out.println("Withdrawl : " + withdrawl);
		System.out.println("deposit :" + deposit);
		finalbalance = (balance + deposit) - withdrawl;
		System.out.println("Final Balance :" + finalbalance);
	}

}
