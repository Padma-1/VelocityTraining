package basics;

import java.util.Scanner;

public class _10SwitchDemo {

	public static void main(String[] args) {
		int a,b,res;
		String op;//we use use int n; also
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Enter any arithmeticOperator: ");//+,-,*,/
		op=sc.next();
		sc.close();
		
		switch(op) {
			case "+" :res=a+b;
					System.out.println("The addition is : "+ res);
					break;
			case "-" : res=a-b;
			System.out.println("The subtraction is :"+res);
			break;
			case "*" : res=a*b;
			System.out.println("The multiplication is :"+res);
			break;
			case "/": res=a/b;
			System.out.println("The division is :"+res);
			break;
			default: System.out.println("Invalid Operator");
			break;
		}
	}

}
