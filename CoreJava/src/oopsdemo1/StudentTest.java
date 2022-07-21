package oopsdemo1;

public class StudentTest {

	public static void main(String[] args) {
		
		//create a object of Student class
		Student s1 = new Student();
		Student s2 = new Student();
		
		//invoke methods of student class using dot operator
		s1.input();
		float tot = s1.calculate();	//invoke method & return value
		s1.display();
		System.out.println("Total displayed from main: "+tot);
		
		s2.input();
		float tot1 = s2.calculate();	//invoke method & return value
		s2.display();
		System.out.println("Total displayed from main: "+tot1);
		
		
		
		

	}

}
