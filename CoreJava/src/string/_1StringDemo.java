package string;

public class _1StringDemo {

	public static void main(String[] args) {
		
	String s1 = "James Gosling";
	String s2 = "James Gosling";
	String s3 = new String ("James Gosling");
	String s4 = "Hello";
	String s5 = " World";
	//s1==s2 - True, s1==s3 - False
	
	if(s1==s3) {	//it checks Strings points to same reference are not
		System.out.println("Strings are equal");
	}
	else {
		System.out.println("Strings are not equal");
	}
	System.out.println("The length of String \' "+s3+ "\' is: "+s3.length());
	System.out.println(s4.concat(s5));
	System.out.println(s4.replace('l','p'));
	
}
}
