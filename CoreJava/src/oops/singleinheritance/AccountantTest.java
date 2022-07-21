package oops.singleinheritance;

//program to implement single inheritance
public class AccountantTest {
public static void main(String[] args) {
	Accountant a1 = new Accountant(201,"Sharma", "process salary of employees","SAP");
	Accountant a2 = new Accountant(205,"Sharma", "payment to vendors","Tally");
	
	a1.display();
	a1.print();
	
	a2.display();
	a2.print();
	
	
}
}
