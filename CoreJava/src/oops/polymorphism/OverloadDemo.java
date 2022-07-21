package oops.polymorphism;

//which method should be called is decided at compile time itself - static polymorphism -- method overloading
public class OverloadDemo {

	public static void main(String[] args) {

		Addition a = new Addition();

		// invoking add() overload method
		a.add();
		a.add(1, 2);
		a.add(34.75f, 542.67f); // type promotion(float to double) giving float no, it will first check for double but there is nothing then it will check for double.
		a.add(3, 3, 3);
		a.add("Padma ", "Uppalapati");
		a.add(2, 3.34);
		a.add(3.34,2);

	}

}
