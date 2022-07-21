package basics;
/*
Odd		Even
----	----
1		2
3		4
5		6
7		8
9		10
*/

public class _14OddEvenDisplay {

	public static void main(String[] args) {
		System.out.println("Odd\tEven");
		System.out.println("----\t----");
		int i=1;
		while(i<=10) {
			if(i%2==1) {
				System.out.print(i);
			}
			else {
				System.out.println("\t"+i);
			}
			i++;
		}
	}

}
