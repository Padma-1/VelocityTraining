package oops.multipleinheritance;

//multiple interface implementation - multiple inheritance
//studentDetails class implements abstract methods of 2 interfaces
public class StudentDetails implements CollegeData,HostelData{
	

	College c1 = new College("Mary",500,"Delhi University","MCA");
	Hostel h1 = new Hostel("Ram","Block A");
	

	@Override
	public void hostelDetail() {
		System.out.println("*******Hostel Details*******");
		System.out.println("Hostel Name : "+h1.getName());
		System.out.println("Location : "+h1.getLocation());
		
	}

	@Override
	public void studentRecord() {
		System.out.println("Students seleceted based on percentage & Finanical Sitaution");
		
	}

	@Override
	public void collegeDetail() {
		System.out.println("*******College Details*****");
		System.out.println("College Name : "+c1.getName());
		System.out.println("College Id : "+c1.getId());
		System.out.println("course : "+c1.getCourse());
		System.out.println("University : "+c1.getUniversity());
	}

	@Override
	public void studentData() {
		System.out.println("Students can join courses : MCA, MTech, BCA, BTech");
		
	}
	
	
	
	

}
