package basics;

import java.util.Scanner;

public class _13SumOfSeries {

	public static void main(String[] args) {
		int i=1,n,sum=0;
		Scanner sc=  new Scanner(System.in);
		System.out.println("Enter value for N: ");
		n=sc.nextInt();
		sc.close();
		while(i<=n) {
			sum+=i;
			i++;
		}
		System.out.println("The sum of the series is :"+sum);
		

	}

}
