package oops.abstraction;

public abstract class Trainee {

	private String name;
	private String address;
	private int number;
	
	public Trainee(String name, String address, int number) {
		this.name = name;
		this.address = address;
		this.number = number;
	}
	
	//abstarct method declaration --must be overriden in the derived class.
	public abstract double calculateMarks();
	
	void show() {
		System.out.println("Display marks for :"+this.name+" "+this.address);
	}

	@Override
	public String toString() {
		return "Trainee [name=" + name + ", address=" + address + ", number=" + number + "]";
	}
	
	
}
