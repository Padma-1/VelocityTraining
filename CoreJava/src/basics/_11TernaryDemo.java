package basics;

/*It is a conditional operator with 3 operands
used in place of if-else
	syntax: variable = exp1?exp2:exp3*/
			

public class _11TernaryDemo {

	public static void main(String[] args) {
		int a=100,b=220,max;
		System.out.println("First Number :"+a);
		System.out.println("Second Number : "+b);
		max=(a>b)?a:b;	//ternary operator
		String msg=(a>b)? "A is greatest": "B is greatest";
		System.out.println("Maximum of two numberes is :"+max+" . "+msg);
	}

}
