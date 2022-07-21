package oops.composition;

import java.util.ArrayList;
import java.util.List;

public class LibraryCompositionDemo {

	public static void main(String[] args) {

		// Creating the objects of book class
		Book b1 = new Book("Effective Java", "Joshua Bloch");
		Book b2 = new Book("Thinking in java", "Bruce Eckel");
		Book b3 = new Book("Java: The Complete Reference", "Hebert Schildt");

		// Creating the list which contains the no.of books
		List<Book> books = new ArrayList<Book>();
		books.add(b1);
		books.add(b2);
		books.add(b3);
		
		//Library object with books List initialized
		Library lib = new Library(books);
		
		// get the book List
		List<Book> bks = lib.getBooks();
		
		for (Book bk : bks) {
			System.out.println("Title: " + bk.title + " and Author : " + bk.author);
		}
	
	}
}
