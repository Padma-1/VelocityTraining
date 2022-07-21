package oopsdemo1;
class Employee{
	int empId;
	String name;
	
	public void setData(int c, String d) {
		empId=c;
		name=d;
	}
	
	public void showData() {
		System.out.print("EmpId = "+empId+" "+"Employee Name = "+name);
		System.out.println();
	}
}
public class ArrayOfObjectsDemo {

	public static void main(String[] args) {
	
		//create array of Employee object
		Employee[] ob = new Employee[5];
		
		//create actual Employee Object
		for(int i=0;i<5;i++) {
			ob[i]=new Employee();
		}
		
		//assign data to employee Objects
		ob[0].setData(100, "Devi");
		ob[1].setData(101, "Padma");
		ob[2].setData(102, "Rao");
		ob[3].setData(103, "Pavan");
		ob[4].setData(104, "Vijaya");
		
		//display employee object data
		System.out.println("******Employee Details*********");
		for (int i=0;i<5;i++) {
			ob[i].showData();
		}
		System.out.println("********************************");

	}

}
