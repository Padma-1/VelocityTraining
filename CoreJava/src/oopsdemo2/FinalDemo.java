package oopsdemo2;

final class Hello {
	final void display() {
		System.out.println("This is a final method");
	}
}

/*
class World extends Hello { // final classes cannot be extended
	
	// final methods cannot be overriden
	void display() {
		System.out.println("This is a final method");
	}

}
*/

public class FinalDemo {

	public static void main(String[] args) {
		final int AGE = 20;
		final float PI = 3.14f;
		// AGE=30;//compilation error --> final variables values cannot be changed.

	}

}
