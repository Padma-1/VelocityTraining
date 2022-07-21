package exceptions;

//general Exception Handling
public class _3ExceptionDemo {

	public static void main(String[] args) {
		String languages[] = {"C","C++","Java","Perl","Python"};
		try {
			for(int i=0;i<=5;i++) {	//bcoz of i=5
				System.out.println(languages[i]);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
