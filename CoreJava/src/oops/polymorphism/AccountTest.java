package oops.polymorphism;

//program to implement method overriding
public class AccountTest {

	public static void main(String[] args) {
		SavingsAccount s = new SavingsAccount("John",500, 4);
		System.out.println("\nSavings account details");
		System.out.println("----------------");
		System.out.println(" "+s.getName()+" has an initial balance of: "+s.getBalance());
		s.deposit(200);
		s.withdraw(300); //invokes base class methods
		System.out.println(" "+s.getName()+" at the end of transaction the balance of: "+s.getBalance());
		
		System.out.println("\nChecking account details");
		System.out.println("----------------");
		CheckingAccount c = new CheckingAccount("Stephen", 500, 200);
		System.out.println(" "+c.getName()+ " has an intial Balance of: "+c.getBalance());
		c.deposit(200);
		c.withdraw(900);// invokes overriden method od derived class
		System.out.println(" "+c.getName()+" at the end of transaction the balance of: "+c.getBalance());
	}

}
