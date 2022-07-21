package exceptions;

public class _8ThrowsDemo {

	void Division() throws ArithmeticException {
		int a = 45, b = 0, rs;
		rs = a / b;
		System.out.print("\n\tThe result is :" + rs);

	}

	public static void main(String[] args) {

		_8ThrowsDemo t = new _8ThrowsDemo();
		try {
			t.Division();
		} catch (ArithmeticException Ex) {
			System.err.print("\n\tError : " + Ex.getMessage());
		}
		System.out.print("\n\tEnd of program.");

	}

}
