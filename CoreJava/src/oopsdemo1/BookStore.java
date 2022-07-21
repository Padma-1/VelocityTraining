package oopsdemo1;

import java.util.Scanner;

public class BookStore {
	private long bookId;
	private String authorName;
	private String bookName;
	private double bookPrice;

	Scanner sc=new Scanner(System.in);

	public void inputBookDetails() {
		System.out.println("Enter Book ID, authorName, bookName & bookPrice");
		bookId=sc.nextInt();
		authorName=sc.next();
		bookName=sc.next();
		bookPrice=sc.nextFloat();
	}

	public void displayBookDetails() {
		System.out.println("************Book Details******************");
		System.out.println("BookId :"+bookId);
		System.out.println("Author Name :"+authorName);
		System.out.println("Book Name :"+bookName);
		System.out.println("Book Price :"+bookPrice);
	}
}
