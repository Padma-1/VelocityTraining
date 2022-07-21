package basics;

import java.util.Arrays;

public class _23ArrayFunctionsDemo {

	public static void main(String[] args) {
		int[] n1= {1,2,4,1,6,7,-3};
		int[] n3=new int[5];
		int[] n2=new int[n1.length];
		System.out.println("Array Contents without loop: ");
		System.out.println("n1 :"+Arrays.toString(n1));
		System.out.println("Display Array elements with enhanced for loop: ");
		
		for(int i:n1) {
			System.out.print(i+ " ");
		}
		System.out.println();
		
		//copy entire array n1 to n2
		System.arraycopy(n1, 0, n2, 0, n1.length);
		
		//convert array to string and print
		System.out.println("n2 = "+Arrays.toString(n2));
		
		//copy partial array elements
		System.arraycopy(n1, 2, n3, 1, 2);
		System.out.println("n3 :"+Arrays.toString(n3));
		
		//sort an array
		Arrays.sort(n2);
		System.out.println("Sorted n2 array: "+Arrays.toString(n2));
		
		n2[1]=77;
		n2[5]=100;
		System.out.println("Sorted n2 array: "+Arrays.toString(n2));
	}

}
