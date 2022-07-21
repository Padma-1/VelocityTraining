package basics;

import java.util.Scanner;

public class _2SumAvg {

	public static void main(String[] args) {
		
		int n1,n2,sum;
		float avg;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number: ");
		n1=scan.nextInt();
		System.out.println("Enter second number: ");
		n2=scan.nextInt();
		sum = n1+n2;
		System.out.println("Resultant sum: "+ sum);
		avg=(float)sum/2;
		System.out.print("Average : ");
		System.out.format("%.3f", avg);
		scan.close();//closing the scanner object
	
		
		
	}

}
