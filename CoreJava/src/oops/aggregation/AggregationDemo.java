package oops.aggregation;

public class AggregationDemo {

	public static void main(String[] args) {
		
		Address a1 = new Address("Bangalore", "Karnataka", "India", 38740);
		Address a2 =  new Address("Prague", "Austin", "Czech", 23230);
		
		Student s1 = new Student(101,"Ravi",a1);
		Student s2 = new Student(102,"Mike",a2);
		
		s1.display();
		s2.display();

	}

}
