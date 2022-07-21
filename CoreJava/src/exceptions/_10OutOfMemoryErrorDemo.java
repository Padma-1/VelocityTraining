package exceptions;

import java.io.IOException;


public class _10OutOfMemoryErrorDemo {

	public void createArray(int size) {
		try {
			Integer[] a = new Integer[size];
		}
		/*
		 * System.err is a PrintStream. System.err works like System.out except it is
		 * normally only used to output error texts. Some programs (like Eclipse) will
		 * show the output to System.err in red text, to make it more obvious that it is
		 * error text.
		 */
		catch (OutOfMemoryError e) {
			System.err.println("Array Size too Large " + e);
			System.err.println("Max JVM Memory: " + Runtime.getRuntime().maxMemory());
		
			System.err.println("Java Version :" + Runtime.version());

		}
	}

	public static void main(String[] args) {
		_10OutOfMemoryErrorDemo d1 = new _10OutOfMemoryErrorDemo();

		d1.createArray(1000 * 1000 * 1000);

		try {
			Runtime.getRuntime().exec("calc"); //can give mspaint, calc etc...
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}