package basics;

public class _12WhileDemo {

	public static void main(String[] args) {
		int i=1; //loop initialization
		while(i<=10) {	//set a condition True
			System.out.println(i+ " : Padma");
			i++;
		}
		System.out.println("Exiting the loop...........");
		
		System.out.println("*******Reverse Loop***********");
		int j=10;
		while(j>=1) {
			System.out.println(j);
			j-=1;
		}
	}

}
