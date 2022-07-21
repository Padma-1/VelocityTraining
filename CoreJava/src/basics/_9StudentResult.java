package basics;

import java.util.Scanner;

public class _9StudentResult {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*************Enter Student Details************");
		System.out.print("Enter student Roll Number : ");
		int roll = sc.nextInt();
		System.out.print("Enter Student name        : ");
		String name = sc.next();
		System.out.println("Enter marks of 5 subjects : ");
		float m1 = sc.nextFloat();
		float m2 = sc.nextFloat();
		float m3 = sc.nextFloat();
		float m4 = sc.nextFloat();
		float m5 = sc.nextFloat();
		sc.close();
		float total = (m1+m2+m3+m4+m5);
		float agg = (10*total)/500; //calculating aggregate out of 10 with 500 marks.
		System.out.println("************Student Result**************");
		System.out.println("Roll Number    : "+roll);
		System.out.println("Student Name   : "+name);
		System.out.println("Total Marks    : "+total);
		System.out.println("Aggregate      : "+agg);
		
		if(agg>=8.5) {
			System.out.println("Result         : Distinction");
		}
		else if(agg>=7.0 && agg<=8.5) {
			System.out.println("Result         : First Class");
		}
		else if(agg>=5 && agg<7) {
			System.out.println("Result         : Second Class");
		}
		else if(agg>=4 && agg <5) {
			System.out.println("Result         : Pass Class");
		}
		else {
			System.out.println("Result         : Fail");
		}
		System.out.println("*****************************************");
	}

}
