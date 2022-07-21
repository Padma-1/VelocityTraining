package basics;

import java.util.Scanner;

public class _18CountVowels {

	public static void main(String[] args) {
		//String s ="java is fun";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String str =sc.nextLine();
		String s=str.toLowerCase();
		sc.close();
		int count =0;
		System.out.println("The Length of String is : "+s.length());
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e'||s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
				count++;
				System.out.println("Vowel Found: "+s.charAt(i));
			}
		}
		System.out.println("Total number of vowels in string : " +count);

	}

}
