package exceptions;

import java.io.IOException;

public class _9ThrowsExample {

	void myMethod(int a) throws IOException, ArithmeticException {
		if (a == 1)
			throw new IOException("IO Exception Ocurred");
		else
			throw new ArithmeticException("Arithmetic Exception");
	}

	public static void main(String[] args) {

		_9ThrowsExample t = new _9ThrowsExample();
		try {
			t.myMethod(1);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());

		}
	}
}