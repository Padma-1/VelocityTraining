package oopsdemo1;

public class Trainee {
	
	private int id;
	private String name,tech;
	private double stipend;
	
	public Trainee() {
		System.out.println("Implicit Constructor");
		this.id=10;
		this.name="James";
		this.tech="java";
		this.stipend=5000;
	}

	public Trainee(int id, String name, String tech, double stipend) {
		this.id = id;
		this.name = name;
		this.tech = tech;
		this.stipend = stipend;
	}
	
	
	
	void display()
    {
        System.out.println("********** Trainee Details ***************");
        System.out.println(this.id+" "+this.name+" "+this.tech+" "+this.stipend);
        System.out.println("------------------------------------------");
    }

}
