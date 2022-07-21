package basics;

import java.util.Scanner;

public class _6SingleDigit {
	public static void main(String[] args) {
	int a;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number: ");
	a=sc.nextInt();
	sc.close();
	if(a>=-9 && a<=9) {
		System.out.println(a+" is single digit number");
	}
	else {
		System.out.println(a+" is not a single digit number");
	}
}
}