package miscellaneous;

public class Container<T> {

	private T t;
	public void add(T t) {
		this.t=t;
	}
	public  T get() {
		return t;
	}
	public static void main(String[] args) {
		Container<String> strContainer =  new Container<String>();
		
		Container<Integer> intContainer =  new Container<Integer>();
		Container<Double> dblContainer =  new Container<Double>();
		Container<Character> chrContainer =  new Container<Character>();
		
		strContainer.add("James Gosling");
		intContainer.add(1000);
		dblContainer.add(89.007);
		chrContainer.add('A');
		System.out.println("The Integer value : "+strContainer.get());
		System.out.println("The String value : "+intContainer.get());
		System.out.println("The Double value : "+dblContainer.get());
		System.out.println("The Chracter value : "+chrContainer.get());
		

	}

}
