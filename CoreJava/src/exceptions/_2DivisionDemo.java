package exceptions;

import java.util.Scanner;

public class _2DivisionDemo {

	public static void main(String[] args) {
		int a,b,result;
		Scanner s = new Scanner(System.in);
		System.out.println("Input two numbers :");
		a=s.nextInt();
		b=s.nextInt();	
		
		try {	//statements to be monitored which may throw exception
		result = a/b;
		System.out.println("Result = "+result);
		}
		catch(ArithmeticException e) {	//Exception thrown is handled in catch block
			System.out.println("Divide by Zero Error - Enter non-zero value");
			System.out.println("Exception Description :"+e.getMessage());
			System.out.println("Exception Name & Description :"+e.toString());
			//details about exception anme, description, line number of code which generated exception
			e.printStackTrace();
			
		}
		finally //clean - up operations
		{
			s.close();
			System.out.println("The Finally Block - Program Execution Ended");
		}

}
}
