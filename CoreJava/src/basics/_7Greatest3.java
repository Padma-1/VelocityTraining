package basics;

import java.util.Scanner;

public class _7Greatest3 {

	public static void main(String[] args) {
		
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers...");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		sc.close();
		//we can have other conditions like 2 are equal and other is diff. so can add more conditions also.
		if(a>b && a>c) {
			System.out.println(a+ " is greatest");
		}
		else if(a==b &&  b==c) {
			System.out.println("All numbers are equal");
		}
		else if(b>c) {
			System.out.println(b+ " is greatest");
		}
		
		else {
			System.out.println(c+ " is greatest");
		}

	}

}
