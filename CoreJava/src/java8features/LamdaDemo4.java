package java8features;

//perform arithmetic operations using Lambda
public class LamdaDemo4 {

	public static void main(String[] args) {

		ArithmeticOperations op1 = (a, b) -> (a + b); // lambda expression
		// invoke lambda expression
		System.out.println("Addition of 2 Nos is : " + op1.calculate(200, 155));

		ArithmeticOperations op2 = (a, b) -> (a - b);
		System.out.println("Subtraction of 2 Nos is : " + op2.calculate(200, 155));

		ArithmeticOperations op3 = (a, b) -> (a * b);
		System.out.println("Multiplication of 2 Nos is : " + op3.calculate(200, 155));

		ArithmeticOperations op4 = (int a, int b) -> (a / b);
		System.out.println("Division of 2 Nos is : " + op4.calculate(200, 155));

	}

}
