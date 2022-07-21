package oopsdemo1;

import java.util.Scanner;

//instance class
public class Student {
	
	//properties/state/attributes
	private int rollNumber;
	private String name,course;
	private float m1,m2,m3,total;
	Scanner sc=new Scanner(System.in);
	
	//instance methods/behavior/functions
	
	public void input()
	{
		System.out.println("Enter RollNo,Name,Course: ");
		rollNumber=sc.nextInt();
		name=sc.next();
		course=sc.next();
		
		System.out.println("Enter marks of 3 subjects: ");
		m1=sc.nextFloat();
		m2=sc.nextFloat();
		m3=sc.nextFloat();
	}
	
	public float calculate()	//method with return type float
	{
		total=m1+m2+m3;
		return total;
	}
	public void display() {
		System.out.println("********Student Details**********");
		System.out.println("Roll No :"+rollNumber);
		System.out.println("Name  :"+name);
		System.out.println("Course :"+course);
		System.out.println("Total Marks  :"+total);
		System.out.println("********************");
	}
	
	
}
