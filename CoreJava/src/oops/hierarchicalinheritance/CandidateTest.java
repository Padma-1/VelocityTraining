package oops.hierarchicalinheritance;

public class CandidateTest {

	public static void main(String[] args) {
		
		JavaCandidate j1=new JavaCandidate(111, "Gavin King", 5000, "Hibernate");
		j1.display();
		j1.getPerks();
		
		AccountsCandidate a1 = new AccountsCandidate(2222, "Mike John", 3000);
		a1.display();
		a1.getPerks();

	}

}
