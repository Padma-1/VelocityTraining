package string;

public class _2StringDemo1 {

	private String firstString = "This is a new String";
	private String secondString = "This is a new String";
	private String concatString;
	private String replacedString;

	private boolean equal;

	void test() {
		equal = firstString.equals(secondString);
		concatString = "The appendage will come behind me ".concat(secondString);
		replacedString = firstString.replace('i', 'z');
	}

	void print() {

		System.out.println("The concatenated value: " + concatString);
		System.out.println("Replacing i's with z's: " + replacedString);

		if (equal) {
			System.out.println("The two strings are equal");	//it will print in this case.
		} else {
			System.out.println("The strings are not equal");
		}
	}

	public static void main(String[] args) {

		_2StringDemo1 s = new _2StringDemo1();
		s.test();
		s.print();

		String s1 = "James Gosling";
		String email = "raj.test@com";

		System.out.println("The Length of string is :" + s1.length()); //13

		if (email.indexOf('.') > email.indexOf('@')) // return position of character
			System.out.println("Valid Email Id");
		else
			System.out.println("Invalid Email Id");	//it will print in console

		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.concat(email));
		System.out.println(s1.substring(2, 8)); // Extract substring from a string excluding the ending index //mes Go in output.
		System.out.println(s1.substring(6, s1.length())); // System.out.println(s1.substring(6)); -- This will also works same.
		System.out.println(s1.contains("James")); // return true as s1 contains James

		/*
		 * The compareTo() method compares two strings lexicographically (in the dictionary order).
		 * The comparison is based on the Unicode value of each character in the strings. 
		 * returns 0 if the strings are equal 
		 * returns a negative integer if the string comes before the str argument in the dictionary order
		 * returns a positive integer if the string comes after the str argument in the dictionary order
		 */

		String str1 = "Learn Java";
		String str2 = "Learn Java";
		String str3 = "Learn Kotlin";

		System.out.println(str1.compareTo(str2)); //0	-- Both Strings are equal
		System.out.println(str1.compareTo(str3)); // first string is > 2nd string -ve will occur
		System.out.println(str3.compareTo(str1)); //1
	}

}
