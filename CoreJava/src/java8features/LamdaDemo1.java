package java8features;

@FunctionalInterface
interface MyFI{
	public String sayHello();
	//public String sayHello();	//It gives error as FI must contain single abstract method
}

public class LamdaDemo1 {

	public static void main(String[] args) {
		
		MyFI msg = () -> { return "Hello World";}; //lamda expression
		System.out.println(msg.sayHello());
	}

}
