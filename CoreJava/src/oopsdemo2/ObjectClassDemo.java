package oopsdemo2;

public class ObjectClassDemo {

	public static void main(String[] args) {

		Object o = new Object(); // create object of object class
		System.out.println(o.hashCode());
		System.out.println(o.toString());

		System.out.println(o.getClass());

		Object o1 = new Object();
		System.out.println(o1.equals(o));
		System.out.println(o.hashCode());
		System.out.println(o.toString());

		Object o2 = o1;
		System.out.println(o2.equals(o1));

		String s1 = "Java";
		String s2 = "Java";
		String k = new String("Java");

		System.out.println(s1.equals(s2)); // true
		System.out.println(s1.equals(k)); // true --check content
		System.out.println(s1 == s2); // true
		System.out.println(s1 == k); // false --check reference
	}

}
