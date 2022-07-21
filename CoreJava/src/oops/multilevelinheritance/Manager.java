package oops.multilevelinheritance;

public class Manager extends Staff{
	protected float da;
	private float gross;
	
	public Manager(int empId, String name, float salary) {
		super(empId, name, salary);
	}
	
	void getDA() {
		da = (salary*80)/100;
		System.out.println("DA is :"+da);
	}
	
	void getGross() {
		gross = salary+hra+da;
		System.out.println("Gross salary of manager is :"+gross);
	}	

}
