package oops.abstraction;

public class TraineeAbstractionTest {

	public static void main(String[] args) {
		
		Trainee t = new Marks("John","New York",1001,35);	//upcasting
		
		t.show();	//invoke abstract base class method
		double marks = t.calculateMarks();	//invoke subclass method
		System.out.println(t+" "+marks);
	}
}
