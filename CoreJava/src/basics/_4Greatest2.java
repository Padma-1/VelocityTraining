package basics;

import java.util.Scanner;

public class _4Greatest2 {
	public static void main(String[] args) {
		int a,b;
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter 2 Numbers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		sc.close();
		
		if(a>b) {
			System.out.println(a +" is Greatest");
		}
		else {
			System.out.println(b + " is Greatest");
		}
		
	}
}
