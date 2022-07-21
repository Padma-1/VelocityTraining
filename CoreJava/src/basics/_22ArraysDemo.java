package basics;

import java.util.Arrays;
import java.util.Scanner;

public class _22ArraysDemo {

	public static void main(String[] args) {
		int[] num = {111,10,23,56,23,90};
		int i;
		System.out.println("Array Contents");
		for(i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		System.out.println("The Size of array is :"+num.length);
		System.out.println("First element of an array :"+num[0]);
		System.out.println("Last element of an array :"+num[num.length-1]);
		
		System.out.println("***************************************");
		int n,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		n=sc.nextInt();
		sc.close();
		
		int num1[]=new int[n]; //declare array & allocate memory
		
		System.out.println("Enter array elements : ");
		for(j=0;j<n;j++) {
			num1[j]=sc.nextInt();	
		}
		for(j=0;j<n;j++) {
			System.out.print(num1[j]+" ");	
		}
		System.out.println();
		System.out.println("Display array contents without loop ");
		System.out.println(Arrays.toString(num1));
		
		
	}

}
