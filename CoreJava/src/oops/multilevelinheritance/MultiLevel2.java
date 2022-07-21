package oops.multilevelinheritance;

/*
 * Multilevel inheritance
 * Director -> Manager ->Staff
 */
public class MultiLevel2 {

	public static void main(String[] args) {
	
		Director d1 = new Director(101, "Keane", 5000);
		System.out.println("*************Director Details**************");
		d1.display();
		d1.getHRA();d1.getDA();d1.getTA();d1.getGross();
		
		System.out.println("*************Manager Details**************");
		Manager m1 = new Manager(201, "Mary", 4000);
		m1.display();m1.getHRA();m1.getGross();m1.getDA();
		
		System.out.println("*******Staff Details********");
		Staff s1 = new Staff(301, "Helen", 2000);
		s1.display();s1.getHRA();s1.print();
		
	}

}
