package oops.hierarchicalinheritance;

public class AccountsCandidate extends Candidate{
	
	public AccountsCandidate(int id, String name, double salary) {
		super(id, name, salary);
		
	}

	double perks;
	
	void getPerks() {
		perks=salary*.05;
		System.out.println("Perks of account candidate is :"+perks);
	}

}
