package oops.multilevelinheritance;

public class Director extends Manager{
	
	private float ta, gross;
	
	public Director(int empId, String name, float salary) {
		super(empId, name, salary);
	}
	
	void getTA() {
		ta=(salary*30)/100;
		System.out.println("TA is :"+ta);
	}
	
	void getGross() {
		gross =  salary+hra+da+ta;
		System.out.println("Gross salary of Director is :"+gross);
	}

	
	
	
}
