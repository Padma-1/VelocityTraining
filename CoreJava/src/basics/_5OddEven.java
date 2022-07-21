package basics;

import java.util.Scanner;

public class _5OddEven {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		a=sc.nextInt();
		sc.close();
		if(a%2==0) {
			System.out.println(a+" is even number");
		}
		else {
			System.out.println(a+" is odd number");
		}

	}

}
