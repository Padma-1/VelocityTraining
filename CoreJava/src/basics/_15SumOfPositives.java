package basics;

import java.util.Scanner;

public class _15SumOfPositives {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		int n=0;
		while(n>=1) {//loop continues until entered number is positive
			sum+=n;
			System.out.println("Enter a number");
			n=sc.nextInt();
		}
		sc.close();
		System.out.println("Sum = "+sum);	
	}

}
