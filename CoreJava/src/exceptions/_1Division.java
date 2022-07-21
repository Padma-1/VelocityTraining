package exceptions;

import java.util.Scanner;

//program to perform division of 2 numberes withour exception Handling
public class _1Division {

	public static void main(String[] args) {
		int a, b, result;
		Scanner s = new Scanner(System.in);
		System.out.println("Input two numbers :");
		a=s.nextInt();
		b=s.nextInt();	//enter 0
		result = a/b;
		System.out.println("Result = "+result);
		s.close();
	}

}
