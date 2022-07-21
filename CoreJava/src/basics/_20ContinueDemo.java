package basics;

import java.util.Scanner;
//program to calculate sum of only positive numbers entered by user
public class _20ContinueDemo {

	public static void main(String[] args) {
		Double number,sum=0.0;
		Scanner sc=new Scanner(System.in);
		sc.close();
		while(true) {
			System.out.println("Enter a number: ");
			number=sc.nextDouble();
			if(number<0.0) {
				continue;
			}
			sum+=number;
			System.out.println("Sum : "+sum);
		}

	}

}
