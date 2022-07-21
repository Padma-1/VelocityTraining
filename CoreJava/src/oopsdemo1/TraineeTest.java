package oopsdemo1;

public class TraineeTest {
	public static void main(String[] args) {
		
		Trainee t1 = new Trainee();	//Invokes implicit constructor
		t1.display();
		
		Trainee t2= new Trainee(222,"Rod Jhonson","Spring",7000);	//Invokes parameterized constructor
		t2.display();
		
		
	}

}
